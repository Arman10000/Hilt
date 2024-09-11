package com.example.hilt.fragment.fragment2

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hilt.R
import com.example.hilt.fragment.fragment1.Fragment1ViewModel
import com.example.hilt.fragment.fragment2.di.Person3
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Fragment2 : Fragment(R.layout.fragment_2) {

    @Inject
    lateinit var person3: Person3

    private val viewModel: Fragment2ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(viewModel)
    }

    companion object {
        fun newInstance(data: Int) = Fragment2().apply {
            arguments = bundleOf("key" to data)
        }
    }
}