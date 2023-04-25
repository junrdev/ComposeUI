package com.star.mediui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.star.mediui.ui.HomeScreen
import com.star.mediui.ui.theme.MediuiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediuiTheme{
                HomeScreen()
            }
        }
    }
}
