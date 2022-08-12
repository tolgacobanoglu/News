package com.tolgacobanoglu.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.tolgacobanoglu.newsapp.database.ArticleDatabase
import com.tolgacobanoglu.newsapp.databinding.ActivityMainBinding
import com.tolgacobanoglu.newsapp.repository.NewsRepository
import com.tolgacobanoglu.newsapp.repository.NewsViewModelProviderFactory
import com.tolgacobanoglu.newsapp.viewmodel.NewsViewModel

class MainActivity : AppCompatActivity()
{
    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val repository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)


        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id)
            {
                R.id.splashFragment->
                {
                    binding.bottomNavigationView.visibility = View.GONE
                }
            }
        }



    }
}
