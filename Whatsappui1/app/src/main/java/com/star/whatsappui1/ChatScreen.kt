package com.star.whatsappui1

import android.content.Context
import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.star.whatsappui1.ui.theme.ChatBack
import com.star.whatsappui1.ui.theme.TextWhite

@Composable
fun ChatsScreen(chats : List<Chat>, context: Context) {

    LazyColumn(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier){
        items(chats.size){
            ChatItem(
                chat = chats[it],
                modifier = Modifier.clickable {

                }
            )


            Spacer(
                modifier = Modifier
                    .size(2.dp)
                    .padding(start = 10.dp)
            )
        }
    }
}

@Composable
fun ChatItem(chat : Chat,modifier: Modifier=Modifier) {

    var username by remember {
        mutableStateOf(chat.content)
    }
    Box(modifier
        .fillMaxWidth()
        .background(ChatBack)
        .padding(5.dp),
    ) {

    //        sender profile picture
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .align(Alignment.CenterStart)
                    .border(width = 2.dp, MaterialTheme.colors.primary, shape = CircleShape)

            ){

                Icon(
                    painter = painterResource(id = R.drawable.user_circle_24),
                    contentDescription = "user icon",
                    modifier = Modifier
                        .size(55.dp)
                        ,

                    tint = Color.White
                )
            }

            Column {
                Text(text = chat.sender, modifier = Modifier.padding(start = 90.dp), fontSize = 17.sp, fontWeight = FontWeight.Bold)


                Text(text = chat.content, modifier = Modifier.padding(start = 90.dp, top = 15.dp, bottom = 10.dp), color = TextWhite)
            }

            Row (verticalAlignment = Alignment.Top, modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(5.dp)){
                Text(text = chat.timeSent, color= Color.White)
            }

    }
    
}