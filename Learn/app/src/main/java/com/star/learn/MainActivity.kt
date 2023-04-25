package com.star.learn

import android.os.Bundle
import android.widget.Space
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.star.learn.ui.theme.LearnTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var count = remember {
                mutableStateOf("0")
            }


            /*
            Row(

                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxSize(0.5f),
                horizontalArrangement = Arrangement.SpaceBetween ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Hello world")
                Text(text = "world Hello")
            }

             */

            /*
            Column(
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxHeight(0.5f)
                    .width(300.dp)
                    .padding(16.dp)
                    .border(5.dp, Color.Yellow,)
            ) {
                Text(
                    text = "Hello world",
                    modifier = Modifier
                )
                
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "world Hello",

                    modifier = Modifier.clickable { Toast.makeText(this@MainActivity,"Whoaa", Toast.LENGTH_SHORT).show() })
            }
            */

//            displaying an image in a card view

            /*
            val painter = painterResource(id = R.drawable.cardimg)
            val desc = "Virgil described the color between blck and whte as offwhite"
            val title = "Virgil described the color between blck and whte as offwhite"

            Box(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)
            ){

                ImageCard(painter = painter, contentDescription = desc, title =title )
            }

             */

            /*Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010)),

            ){

                Text(
                    text = "Hello motherfucker",

                    color = Color.White,
                    fontSize = 30.sp,
                )
            }

             */


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ){

                Column(
                    Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(text = "$count")

                    Button(onClick = {
                        
                    }) {

                    }
                }

            }

        }
    }
}


//image card
@Composable
fun ImageCard(
    modifier: Modifier =Modifier,
    painter: Painter,
    contentDescription: String,
    title: String
) {

    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 10.dp
    ) {
        
        Box(
            modifier = Modifier
                .height(200.dp)
        ){

            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

//            gradient
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black),
                            startY = 200f
                        )
                    )
            )


            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }


    }

}

//rwo composable example
@Composable
fun RowView() {

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Surface(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
//                    .weight(1f)//weight is as a result of the ration of the whole screen by the two
                ,
                color = Color.Cyan
            ) {}

            Surface (
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
//                    .weight(1f)
                ,
                color = Color.Green
            ){}
        }
}

//column composable example
@Composable
fun ColumnView() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Surface(
            modifier = Modifier
                .width(120.dp)
                .height(150.dp)
                .weight(1f),
            color= MaterialTheme.colors.primary
        ) {}

        Surface(
            modifier = Modifier
                .width(250.dp)
                .height(100.dp)
                .weight(2f),
            color= Color.Transparent
        ) {}
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Hello world")
            Text(text = "world Hello")
        }
    }
}