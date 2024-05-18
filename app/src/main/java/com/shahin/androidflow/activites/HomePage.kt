package com.shahin.androidflow.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.shahin.androidflow.R
import com.shahin.androidflow.databinding.ActivityHomePageBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomePage : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.recipesFragment,
                R.id.favoriteRecipesFragment
            )
        )

        binding.bottomNavigationView.setupWithNavController(navController)
       // setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
