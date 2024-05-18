package com.shahin.androidflow.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.shahin.androidflow.R


import com.shahin.androidflow.Utlis.NetworkListener
import com.shahin.androidflow.Utlis.NetworkResult

import com.shahin.androidflow.adapter.RecipesAdapter
import com.shahin.androidflow.databinding.FragmentRecipesBinding
import com.shahin.androidflow.roomDB.database.FoodDatabase
import com.shahin.androidflow.viewmodel.RecipesViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class RecipesFragment : Fragment() {

    private var _binding: FragmentRecipesBinding? = null
    private val binding get() = _binding!!
    private lateinit var recipesViewModel: RecipesViewModel

    private val mAdapter: RecipesAdapter by lazy {
        RecipesAdapter()
    }


    @OptIn(ExperimentalCoroutinesApi::class)
    private lateinit var networkListener: NetworkListener

    @Inject
    lateinit var db: FoodDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipesViewModel = ViewModelProvider(requireActivity())[RecipesViewModel::class.java]

    }

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRecipesBinding.inflate(inflater, container, false)

        binding.toolbar.title = "Recipes List"
        binding.toolbar.setTitleTextColor(resources.getColor(R.color.white))
        recipesViewModel.readBackOnline.observe(viewLifecycleOwner) {
            recipesViewModel.backOnline = it
        }
        setUpRecyclerView()
        lifecycleScope.launchWhenStarted {
            networkListener = NetworkListener()
            networkListener.checkNetworkAvailability(requireContext()).collect { status ->
                Log.d("NetworkListener", status.toString())
                recipesViewModel.networkStatus = status
                recipesViewModel.showNetworkStatus()
                readDatabase()
            }
        }


        return binding.root
    }

    private fun setUpRecyclerView() {
        // mAdapter = RecipesAdapter(recipesViewModel)
        binding.recyclerview.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity)
            adapter = mAdapter
        }

        showShimmerEffect()
    }


    private fun readDatabase() {
        lifecycleScope.launch {
            recipesViewModel.readRecipes.observe(viewLifecycleOwner) { database ->
                if (database.isNotEmpty()) {
                    Log.d("RecipesFragment", "readDatabase called!")
                    mAdapter.setData(database, recipesViewModel, db.getFoodRecipeDao())
                    hideShimmerEffect()
                } else {
                    requestApiData()
                }
            }
        }

    }

    private fun requestApiData() {
        Log.d("RecipesFragment", "requestApiData called!")
        recipesViewModel.getRecipes()
        recipesViewModel.recipesResponse.observe(viewLifecycleOwner) { response ->
            Log.e("RecipesFragment", "requestApiData_called!$response")
            when (response) {
                is NetworkResult.Success -> {

                    hideShimmerEffect()
                    // loadDataFromCache()
                    response.data?.let {
                        mAdapter.setData(response.data.results, recipesViewModel,db.getFoodRecipeDao())

                    }

                }

                is NetworkResult.Error -> {
                    hideShimmerEffect()
                    loadDataFromCache()
                    Toast.makeText(
                        requireContext(), response.message.toString(), Toast.LENGTH_SHORT
                    ).show()
                }

                is NetworkResult.Loading -> {
                    showShimmerEffect()
                }
            }
        }
    }


    private fun loadDataFromCache() {
        lifecycleScope.launch {
            recipesViewModel.readRecipes.observe(viewLifecycleOwner) { database ->
                if (database.isNotEmpty()) {
                    mAdapter.setData(database, recipesViewModel, db.getFoodRecipeDao())
                }
            }
        }
    }

    private fun showShimmerEffect() {
        binding.shimmerLayout.startShimmer()
        binding.recyclerview.visibility = View.GONE
    }

    private fun hideShimmerEffect() {
        binding.shimmerLayout.stopShimmer()
        binding.shimmerLayout.visibility = View.GONE
        binding.recyclerview.visibility = View.VISIBLE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}