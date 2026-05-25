package com.projectnabil.basic.java;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    TextView text = new TextView(this);
    text.setText(
      "Selamat datang di " +
        getString(R.string.app_name) +
        "!\nTemplate by Project Nabil"
    );
    text.setTextSize(20f);
    text.setTextColor(Color.BLACK);
    text.setGravity(android.view.Gravity.CENTER);

    setContentView(text);
  }
}

/**
 * ----------------------------------------------------
 *  Android Native Boilerplate
 *  Created by  : Nabil Aba (Project Nabil)
 *  Github      : https://github.com/nabil-aba
 * ----------------------------------------------------
 */
