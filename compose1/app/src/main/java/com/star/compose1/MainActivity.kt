package com.star.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
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

                /*dealing with states
//                declaring count as a state(mutable state -> value that can change over time)
                var count by remember {
                    mutableStateOf(0)
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    
                    Text(
                        text = "$count",
                        fontSize = 30.sp
                    )
                    
                    Button(onClick = {
                        count++
                    }) {
                        Text(text = "Click me")
                    }
                }

                 */

                var textFieldVal by remember {
                    mutableStateOf("")
                }

                var allNames by remember {
                    mutableStateOf(listOf<String>())
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {

//                    top nav
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                     
                        OutlinedTextField(
                            value = textFieldVal,
                            onValueChange ={ txt->
                                //when the value changes
                                textFieldVal = txt
                            },
                            modifier = Modifier.weight(1f)
                        )
                        
//                        adding spacing between elements
                        Spacer(modifier = Modifier.width(16.dp))
                        
                        Button(onClick = {
                            if(textFieldVal.isNotBlank()) {
                                allNames = allNames + textFieldVal
                                textFieldVal=""
                            }
                        }) {
                            Text(text = "Add")
                        }
                    }

                    LazyColumn (
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        items(allNames){
                            curname->
                                Text(
                                    text = "$curname",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp)
                                )

                            Divider()
                        }
                    }

                }
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
