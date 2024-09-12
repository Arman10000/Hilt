package com.example.hilt.fragment.fragment2.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

class Person3

@Module
@InstallIn(ViewModelComponent::class)
class Fragment2Module {

    @Provides
    fun person3(): Person3 = Person3()
}