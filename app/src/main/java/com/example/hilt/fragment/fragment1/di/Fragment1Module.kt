package com.example.hilt.fragment.fragment1.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

class Person2

@Module
@InstallIn(ViewModelComponent::class)
class Fragment1Module {

    @Provides
    fun person2(): Person2 = Person2()

}