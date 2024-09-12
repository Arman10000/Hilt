package com.example.hilt.fragment.fragment1

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.hilt.fragment.fragment1.di.Person2
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class Fragment1ViewModel @Inject constructor(
    @ApplicationContext private val appContext: Context,
    val person2: Person2
) : ViewModel()