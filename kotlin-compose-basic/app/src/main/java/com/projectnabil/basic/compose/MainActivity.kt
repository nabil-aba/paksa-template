package com.projectnabil.basic.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Di Compose, kita tidak pakai setContentView()
        // Kita menggunakan setContent { }
        setContent {
            // Box = Layout seperti FrameLayout, kita buat memenuhi layar (fillMaxSize)
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                // Text = Pengganti TextView
                Text(
                    text =
                        "Selamat datang di ${stringResource(id = R.string.app_name)}!\nTemplate Jetpack Compose by Project Nabil",
                    fontSize = 20.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}

/**
 * ----------------------------------------------------
 * Android Jetpack Compose Boilerplate Created by : Nabil Aba (Project Nabil) Github :
 * https://github.com/nabil-aba
 * ----------------------------------------------------
 */
