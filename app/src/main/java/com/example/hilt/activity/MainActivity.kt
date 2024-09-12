package com.example.hilt.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt.R
import com.example.hilt.fragment.fragment1.Fragment1
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, Fragment1.newInstance())
                .commit()
        }
    }
}