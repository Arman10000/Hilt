package com.example.hilt.fragment.fragment1.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

class Person2

@Module
@InstallIn(FragmentComponent::class)
class Fragment1Module {

    @Provides
    @FragmentScoped
    fun person2() = Person2()
}