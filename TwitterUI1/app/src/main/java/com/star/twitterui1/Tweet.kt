package com.star.twitterui1

import java.time.LocalDate
import java.time.LocalTime
import java.util.Date

data class Tweet(
    val dateTweeted: String,
    val timeTweeted: String,
    val username : String,
    val username_at : String,
    val tweetContent : String,
    val likes:Int,
    val retweets:Int,
    val comments:Int,
    val analytics:Int,
)
