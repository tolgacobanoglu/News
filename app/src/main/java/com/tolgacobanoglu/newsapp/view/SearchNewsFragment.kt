package com.tolgacobanoglu.newsapp.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tolgacobanoglu.newsapp.MainActivity
import com.tolgacobanoglu.newsapp.R
import com.tolgacobanoglu.newsapp.databinding.FragmentSearchNewsBinding
import com.tolgacobanoglu.newsapp.util.viewBinding
import com.tolgacobanoglu.newsapp.viewmodel.NewsViewModel


class SearchNewsFragment : Fragment(R.layout.fragment_search_news)
{
    private val binding by viewBinding(FragmentSearchNewsBinding::bind)
    private lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

    }

}