package com.example.a4thmonthlesson1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.a4thmonthlesson1.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.setupActionBarWithNavController as setupActionBarWithNavController1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        if (supportActionBar != null) {
//            supportActionBar!!.hide()
//        }

        val navView: BottomNavigationView = binding.navView
//        val navDestinations = arrayListOf(
//            R.id.navigation_home,
//            R.id.navigation_dashboard,
//            R.id.navigation_notifications,
//            R.id.navigation_profile
//        )


        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        navController.navigate(R.id.onBoardingFragment)


        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications,
                R.id.taskFragment,
                R.id.navigation_profile,
            )
        )
//        setupActionBarWithNavController1(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
//        navController.addOnDestinationChangedListener {}
    }
}

