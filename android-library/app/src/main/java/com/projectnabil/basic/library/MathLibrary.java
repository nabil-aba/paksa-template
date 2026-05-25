package com.projectnabil.basic.library;

import android.util.Log;

/**
 * Ini adalah contoh Class SDK / Library.
 * Karena ini template Library, project ini tidak bisa di-install langsung ke HP.
 * Hasil build-nya akan berada di output/app-release.aar
 */
public class MathLibrary {

  public static int calculateSum(int a, int b) {
    int result = a + b;
    Log.d("MathLibrary", "Menghitung: " + a + " + " + b + " = " + result);
    return result;
  }

  public static String getLibraryName() {
    return "Paksa SDK v1.0 (Java Edition)";
  }
}

/**
 * ----------------------------------------------------
 *  Created by  : Nabil Aba (Project Nabil)
 *  Github      : https://github.com/nabil-aba
 * ----------------------------------------------------
 */
