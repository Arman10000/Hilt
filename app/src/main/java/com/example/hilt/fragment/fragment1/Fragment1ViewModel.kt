package com.example.hilt.fragment.fragment1

import android.content.Context
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class Fragment1ViewModel @Inject constructor(
    @ApplicationContext private val appContext: Context
) :ViewModel()