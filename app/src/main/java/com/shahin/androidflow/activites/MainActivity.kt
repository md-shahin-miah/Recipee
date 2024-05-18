package com.shahin.androidflow.activites


import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




import com.google.gson.Gson
import com.shahin.androidflow.R
import com.shahin.androidflow.adapter.RecipesAdapter
import com.shahin.androidflow.databinding.ActivityMainBinding
import com.shahin.androidflow.roomDB.database.FoodDatabase
import com.shahin.androidflow.viewmodel.RecipesViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
open class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var postAdapter: RecipesAdapter
    private val postViewModel: RecipesViewModel by viewModels()
    lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var db: FoodDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title = "Home Listing";

       setUi()
       /* postViewModel.getPost()
        postViewModel.response.observe(this, Observer { response ->
            postViewModel.deleteAllPostTable()
            postViewModel.insert(response)
        })*/
        /*lifecycleScope.launch {
            postViewModel.getAllPost.collect { response ->
                binding.recyclerView.visibility = View.VISIBLE
                postAdapter.setData(response as ArrayList<PostEntity>, db.getPostDao())
            }
        }*/


/*
        lifecycleScope.launch {
            postViewModel.getDataFromRoomWithOffset.collectLatest {
                postAdapter.setData(db.getPostDao())
                postAdapter.submitData(it)
            }
        }
*/
    }

    private fun setUi() {
        recyclerView = findViewById(R.id.recyclerView)
       // postAdapter = RecipesAdapter(this, ArrayList())
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = postAdapter
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.new_activity -> {
                startActivity(Intent(this, FavoriteActivity::class.java))
                return false
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        exitByBackKey()
    }

    fun appExit() {
        finish()
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
    protected fun exitByBackKey() {
        val alertbox: AlertDialog = AlertDialog.Builder(this)
            .setMessage("Do you want to exit application?")
            .setPositiveButton("Yes", DialogInterface.OnClickListener { arg0, arg1 ->
                appExit()
            })
            .setNegativeButton("No", // do something when the button is clicked
                DialogInterface.OnClickListener { arg0, arg1 ->

                })
            .show()
    }

}