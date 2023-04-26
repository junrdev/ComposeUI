package com.star.twitterui1

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.star.twitterui1.ui.theme.*

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(HomeDark)
//                .padding(10.dp)
            ){
                
//                TopNavBar()
                LoadTweets(list = demo())
            }
        }
    }

}

@Composable
fun TopNavBar() {
    Box(contentAlignment = Alignment.TopStart, modifier = Modifier.fillMaxWidth()){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(TopNavBg)
                .padding(10.dp)
        ) {

            Text(text = "rettiwt", color = TextWhite, modifier = Modifier)
        }
    }
}

//data for demo tweets
/**
 * Tweet(
 */

fun demo(): List<Tweet> {

    return listOf(
        Tweet(
            dateTweeted = "",
            username = "Brian Codes",
            tweetContent = "Hello world",
            timeTweeted = "",
            likes = 20,
            retweets = 10,
            comments = 30,
            username_at = "@dev_brianke",
            analytics = 100
        ),
        Tweet(
            username = "User 1",
            username_at = "@user_1",
            tweetContent = "Bro! WTF",
            likes = 25,
            comments = 23,
            retweets = 50,
            dateTweeted = "",
            timeTweeted = "",
            analytics = 23
        ),
        Tweet(
            username = "Mulla",
            username_at = "@moonlight",
            tweetContent = "My G\nMy Bro\nWhatsApp",
            likes = 80,
            comments = 20,
            retweets = 45,
            dateTweeted = "",
            timeTweeted = "",
            analytics = 60
        ),
        Tweet(
            username = "La Goat",
            username_at = "@goat",
            tweetContent = "This UI Crazy",
            likes = 250,
            comments = 90,
            retweets = 44,
            dateTweeted = "",
            timeTweeted = "",
            analytics = 30
        ),
        Tweet(
            username = "Tano Nane",
            username_at = "@matata",
            tweetContent = "Good Job Bro",
            likes = 50,
            comments = 90,
            retweets = 64,
            dateTweeted = "",
            timeTweeted = "",
            analytics = 40
        ),
        Tweet(
            username = "Messy Chris",
            username_at = "@messy",
            tweetContent = "SiuuUUU ?!?!",
            likes = 900,
            comments = 290,
            retweets = 900,
            dateTweeted = "",
            timeTweeted = "",
            analytics = 500
        ),
        Tweet(
            username = "Virgil",
            username_at = "@albo",
            tweetContent = "Albo described the color that separates bl!ck and wh!te as Offwhite",
            likes = 900,
            comments = 290,
            retweets = 900,
            dateTweeted = "",
            timeTweeted = "",
            analytics = 500
        )

    )
}