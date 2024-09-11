package com.example.hilt.fragment.fragment1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hilt.R
import com.example.hilt.fragment.fragment1.di.Person2
import com.example.hilt.fragment.fragment2.Fragment2
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Fragment1 : Fragment(R.layout.fragment_1) {

    @Inject
    lateinit var person2: Person2

    private val viewModel: Fragment1ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(viewModel)

        requireActivity().findViewById<Button>(R.id.button).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragmentContainerView, Fragment2.newInstance(1))
                .commit()
        }
    }

    companion object {
        fun newInstance() = Fragment1()
    }
}