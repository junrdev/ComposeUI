package com.star.whatsappui1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.star.whatsappui1.ui.theme.Whatsappui1Theme

//the chat view
class chatview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Whatsappui1Theme {

            }
        }
    }
}

@Composable
fun BottomTextInput() {

    Box(modifier = Modifier){
        TextField(
            value = "",
            onValueChange = { it -> },
            modifier = Modifier
        )
    }
}
