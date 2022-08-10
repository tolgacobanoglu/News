package com.tolgacobanoglu.newsapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.tolgacobanoglu.newsapp.R
import com.tolgacobanoglu.newsapp.databinding.FragmentNewsBinding
import com.tolgacobanoglu.newsapp.util.viewBinding

class NewsFragment : Fragment(R.layout.fragment_news)
{
    private val binding by viewBinding(FragmentNewsBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}