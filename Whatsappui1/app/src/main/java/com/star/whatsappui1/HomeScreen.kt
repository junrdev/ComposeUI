package com.star.whatsappui1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.star.whatsappui1.ui.theme.FabBg
import com.star.whatsappui1.ui.theme.HomeGreen

@Composable
fun HomeScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(HomeGreen),){

        Column {

            Row {
                TopNav()
            }

            Column {
                ChatsScreen(
                    listOf(
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30"),
                        Chat(content = "Hello world", sender = "Brian", timeSent = "07:30")
                    )
                )

            }
        }

//        Fab
        Row (
            modifier = Modifier.align(Alignment.BottomEnd).fillMaxSize().padding(end = 40.dp, bottom = 40.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom
        ){
            Icon(
                painter = painterResource(id = R.drawable.add_circle_24),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(60.dp),
                tint = FabBg
            )
        }


    }
}