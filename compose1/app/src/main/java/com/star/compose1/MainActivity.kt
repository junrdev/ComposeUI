package com.star.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.star.compose1.ui.theme.Compose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose1Theme {

            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column(
//        can pass modifiers in here

    modifier = Modifier
        .size(500.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Hello $name!",
            fontSize = 13.sp,
            modifier = Modifier
                .background(Color.DarkGray)
                .padding(16.dp)
        )

        Text(
            text = "Some other text!",
            fontSize = 13.sp,
            modifier = Modifier
                .background(Color.DarkGray)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose1Theme {

    }
}

//@Composable
//fun LazyColums() {
////    behave the same as recycler view in xml
////    similarly we can define a lazy row
//    LazyColumn(modifier = Modifier.fillMaxSize()){
//
//        items (10){ i->
//            Text(
//                text = "Hello world",
//                modifier = Modifier
//                    .padding(10.dp),
//            )
//        }
//    }
//}
//
//@Composable
//fun IconsPrev() {
//    Icon(
//        imageVector = Icons.Default.Add,
//        contentDescription =null,
//        modifier = Modifier
//            .background(Color.Red)
//    )
//}
//
//@Composable
//fun Images() {
//    Image(
//        painter =
//        painterResource(id = R.drawable.ic_launcher_foreground,),
//        contentDescription = null,
//        modifier = Modifier
//            .background(Color.Black)
//    )
//}
