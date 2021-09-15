package com.yandex.classified

object Dependencies {

    object Android {
        const val core = "androidx.core:core-ktx:${Versions.androidCoreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
    }

    object AndroidTest {
        const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    }

    object Versions {
        const val androidCoreKtx = "1.6.0"
        const val appCompat = "1.3.1"
        const val material = "1.4.0"
        const val constraintLayout = "2.1.0"

        const val junit = "4.13.2"

        const val extJunit = "1.1.3"
        const val espressoCore = "3.4.0"
    }
}
