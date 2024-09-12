package com.example.hilt.fragment.fragment2

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.hilt.fragment.fragment2.di.Person3
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class Fragment2ViewModel @Inject constructor(
    @ApplicationContext private val appContext: Context,
    private val savedStateHandle: SavedStateHandle,
    val person3: Person3
) : ViewModel() {

    init {
        println(savedStateHandle.get<Int>("key"))
    }
}