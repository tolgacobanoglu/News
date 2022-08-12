package com.tolgacobanoglu.newsapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tolgacobanoglu.newsapp.R
import com.tolgacobanoglu.newsapp.databinding.FragmentSearchNewsBinding
import com.tolgacobanoglu.newsapp.util.viewBinding

class ArticleFragment : Fragment(R.layout.fragment_article)
{
    private val binding by viewBinding(FragmentSearchNewsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

    }
}