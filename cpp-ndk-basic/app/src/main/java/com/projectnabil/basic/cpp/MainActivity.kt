package com.projectnabil.basic.cpp

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    // Memuat library C++ yang di-compile oleh CMake
    init {
        System.loadLibrary("native-lib")
    }

    // Mendeklarasikan fungsi dari file C++
    private external fun stringFromJNI(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text =
            TextView(this).apply {
                // Memanggil fungsi C++ dan menampilkannya di layar!
                text = "${stringFromJNI()} \nWelcome to ${getString(R.string.app_name)}"
                textSize = 20f
                setTextColor(Color.BLACK)
                gravity = Gravity.CENTER
            }
        setContentView(text)
    }
}
