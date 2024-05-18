package com.shahin.androidflow.fragments


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.shahin.androidflow.R
import com.shahin.androidflow.adapter.FavoriteRecipesAdapter
import com.shahin.androidflow.databinding.FragmentFavoriteRecipesBinding
import com.shahin.androidflow.roomDB.database.FoodDatabase
import com.shahin.androidflow.viewmodel.RecipesViewModel

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class FavoriteRecipesFragment : Fragment() {

    private val mainViewModel: RecipesViewModel by viewModels()
    private val mAdapter: FavoriteRecipesAdapter by lazy {
        FavoriteRecipesAdapter(
            requireActivity(),
            mainViewModel
        )
    }
    private var _binding: FragmentFavoriteRecipesBinding? = null
    private val binding get() = _binding!!
    @Inject
    lateinit var db: FoodDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentFavoriteRecipesBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        setUpRecyclerView(binding.favoriteRecipesRecyclerView)
        readDatabase()

        binding.toolbar.inflateMenu(R.menu.favorite_recipes_menu); // binding is a ViewBinding
        binding.toolbar.title = "Favorite List"
        binding.toolbar.setTitleTextColor(resources.getColor(R.color.white))
        binding.toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.deleteAll_favorite_recipes_menu -> {
                    mainViewModel.deleteAllFavoriteRecipes()
                    Snackbar.make(binding.root, "All Recipes removed", Snackbar.LENGTH_SHORT)
                        .setAction("Okay") {}.show()
                    binding.favoriteRecipesRecyclerView.visibility = View.GONE
                }

            }
            true
        }
        return binding.root
    }


    private fun setUpRecyclerView(recyclerView: RecyclerView) {
        recyclerView.adapter = mAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
    private fun readDatabase() {
        lifecycleScope.launch {
            mainViewModel.readFavoriteRecipes.observe(viewLifecycleOwner) { database ->
                if (database.isNotEmpty()) {
                    Log.d("FavoriteRecipesFragment", "readDatabase called!")
                    mAdapter.setData(database,db.getFoodRecipeDao())
                    binding.favoriteRecipesRecyclerView.visibility = View.VISIBLE
                    binding.noDataImageView.visibility = View.GONE
                    binding.noDataTextView.visibility = View.GONE
                }else{
                    binding.favoriteRecipesRecyclerView.visibility = View.GONE
                    binding.noDataImageView.visibility = View.VISIBLE
                    binding.noDataTextView.visibility = View.VISIBLE
                }
            }
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        mAdapter.clearContextualActionMode()
        _binding = null
    }

}