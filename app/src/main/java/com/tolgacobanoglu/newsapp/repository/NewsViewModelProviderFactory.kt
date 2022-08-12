package com.tolgacobanoglu.newsapp.repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tolgacobanoglu.newsapp.viewmodel.NewsViewModel

class NewsViewModelProviderFactory(val newsRepository: NewsRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}