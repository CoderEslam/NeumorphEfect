package com.doubleclick.neumorphefect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doubleclick.neumorph.NeumorphCardView

class MainActivity : AppCompatActivity() {

    lateinit var g: NeumorphCardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}