package com.example.hilt.fragment.fragment2.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

class Person3

@Module
@InstallIn(FragmentComponent::class)
class Fragment2Module {

    @Provides
    @FragmentScoped
    fun person3() = Person3()
}