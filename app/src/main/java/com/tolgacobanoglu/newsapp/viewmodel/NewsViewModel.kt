package com.tolgacobanoglu.newsapp.viewmodel

import androidx.lifecycle.ViewModel
import com.tolgacobanoglu.newsapp.repository.NewsRepository

class NewsViewModel(val newsRepository: NewsRepository): ViewModel() {
}