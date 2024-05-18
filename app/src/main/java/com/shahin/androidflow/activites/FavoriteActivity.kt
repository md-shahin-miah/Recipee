package com.shahin.androidflow.activites

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager


import com.shahin.androidflow.adapter.FavoriteRecipesAdapter
import com.shahin.androidflow.databinding.ActivityFavoriteBinding
import com.shahin.androidflow.roomDB.database.FoodDatabase
import com.shahin.androidflow.viewmodel.FavViewModel


import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class FavoriteActivity : AppCompatActivity() {
    lateinit var binding: ActivityFavoriteBinding
    private lateinit var postAdapter: FavoriteRecipesAdapter
    private val favViewModel: FavViewModel by viewModels()
    lateinit var progressBar: ProgressBar
    @Inject
    lateinit var db: FoodDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Favourite Listing";
       // getActionBar()?.setIcon(R.drawable.my_icon);
        setUi()

        lifecycleScope.launch {
            favViewModel.getFullListFav()
                .collect{data ->
                binding.recyclerView.visibility = View.VISIBLE
             //   postAdapter.setData(data as ArrayList<FavoritesEntity>, db.getFoodRecipeDao())
            }
        }

    }

    private fun setUi() {
        //postAdapter = FavouriteAdapter(this, ArrayList())
        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@FavoriteActivity)
            adapter = postAdapter
        }


    }
    private fun showProgress(){
        val layout = RelativeLayout(this)
        progressBar = ProgressBar(this, null, androidx.appcompat.R.attr.progressBarStyle)
        progressBar.isIndeterminate = true
        progressBar.visibility = View.VISIBLE
        val params = RelativeLayout.LayoutParams(100, 100)
        params.addRule(RelativeLayout.CENTER_IN_PARENT)
        layout.addView(progressBar, params)
        setContentView(layout)
    }
    private fun goneProgress(){
        progressBar.visibility = View.GONE
    }

}