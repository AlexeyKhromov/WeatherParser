package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fragments.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, FirstFragment.newInstance())
            .commit()
    }
}