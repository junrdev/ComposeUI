package com.star.whatsappui1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.star.whatsappui1.ui.theme.HomeGreen
import com.star.whatsappui1.ui.theme.Whatsappui1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Whatsappui1Theme {

                Box (modifier = Modifier
                    .fillMaxSize()
                    .background(HomeGreen)){
                    TopNav()
//                    ChatsScreen(chats = listOf(
//                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30")
//                    ))
                }
            }
        }
    }
}
