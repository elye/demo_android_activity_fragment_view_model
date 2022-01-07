package com.example.activityfragmentviewmodel.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.activityfragmentviewmodel.R

class MainFragment : Fragment(R.layout.main_fragment) {
    private val viewModel by viewModels<MainViewModel>()
}