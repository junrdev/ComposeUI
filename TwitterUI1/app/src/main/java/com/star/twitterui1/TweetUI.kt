package com.star.twitterui1

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
import com.star.twitterui1.ui.theme.*

@Composable
fun LoadTweets(list: List<Tweet>) {
    LazyColumn(modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp)) {
        items(list.size) {
            it-> TweetUI(tweet = list[it])
            Spacer(modifier = Modifier.size(10.dp))
        }

    }
}

@Composable
fun TweetUI(tweet: Tweet) {


    var contentClicked by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(
            color = TweetCardColor,
            shape = RoundedCornerShape(5.dp)
        )
        .padding(12.dp),
    ){

        //icon
        Row (modifier = Modifier.align(Alignment.TopStart)){

            Icon(
                painter = painterResource(id = R.drawable.baseline_account_circle_24),
                contentDescription = "User profile picture",
                tint = Color.White,
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .border(
                        2.dp,
                        MaterialTheme.colors.primary,
                        shape = CircleShape
                    )
                    .size(34.dp)
            )

            Icon(
                painter = painterResource(id = R.drawable.baseline_verified_24),
                contentDescription = "bluebadge",
                tint = VerifiedBadge
            )
        }

        //column username and @
        Row {


            Box(contentAlignment = Alignment.TopCenter, modifier = Modifier.padding(start = 20.dp)){
                Row {

                    //@
                    Text(
                        text = tweet.username_at,
                        color = TextUserAt,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 45.dp)
                        ,
                    )

                    //username
                    Text(
                        text = tweet.username,
                        color = TextWhite,
                        modifier = Modifier
                            .padding(start = 70.dp),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Column {

            //content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .border(
                        shape = RoundedCornerShape(5.dp),
                        color = TweetCardContentColor,
                        width = 2.dp
                    ).clickable {
                    contentClicked = !contentClicked
                },
            ) {

                Row (modifier = Modifier.padding(10.dp)){
                    Text(
                        color = TextWhite,
                        maxLines = if(contentClicked) 4 else 1,
                        text = tweet.tweetContent,
                    )
                }

            }

            //likes, comments, retweets and analytics
            Row(
                modifier = Modifier.padding(top = 10.dp, start = 20.dp),
                horizontalArrangement = Arrangement.Center,
            ) {

                //likes
                Row(modifier = Modifier.padding(end = 20.dp)){
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_heart_24),
                        contentDescription = "unlikes",
                        tint = TweetLikeColor,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .size(20.dp)

                    )
                    Text(text = "${tweet.likes}k", fontSize = 12.sp, color = TextWhite, modifier = Modifier)
                }

                //retweets
                Row(modifier = Modifier.padding(end = 20.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_repeat_24),
                        contentDescription = "unretweets",
                        tint = MaterialTheme.colors.primary,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .size(20.dp)
                    )
                    Text(text = "${tweet.retweets}m", fontSize = 12.sp, color = TextWhite)
                }

                //comments
                Row (modifier = Modifier.padding(end = 17.dp)){
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_message_24),
                        contentDescription = "uncomments",
                        tint = MaterialTheme.colors.primary,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .size(20.dp)
                    )
                    Text(text = "${tweet.comments}m", fontSize = 12.sp, color = TextWhite)
                }

                //analytics
                Row (modifier = Modifier){
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_signal_cellular_alt_24),
                        contentDescription = "unalytics",
                        tint = MaterialTheme.colors.primary,
                        modifier = Modifier
                            .padding(end = 3.dp)
                            .size(20.dp)
                    )
                    Text(text = "${tweet.analytics}m", fontSize = 12.sp, color = TextWhite)
                }
            }
        }

    }
}