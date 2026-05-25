package com.projectnabil.basic.kotlin

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Selamat datang di ${getString(R.string.app_name)}!\nTemplate by Project Nabil"
        text.textSize = 20f
        text.setTextColor(Color.BLACK)
        text.gravity = android.view.Gravity.CENTER

        setContentView(text)
    }
}

// ----------------------------------------------------
//  Android Native Boilerplate (Kotlin)
//  Created by  : Nabil Aba (Project Nabil)
//  Github      : https://github.com/nabil-aba
// ----------------------------------------------------
