package com.conamobile.nuntium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.core.content.ContextCompat
import com.conamobile.nuntium.ui.utils.Navigation

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor = ContextCompat.getColor(this, R.color.white)
            Navigation()
        }
    }
}