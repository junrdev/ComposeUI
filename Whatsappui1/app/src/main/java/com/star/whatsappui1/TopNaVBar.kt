package com.star.whatsappui1

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.star.whatsappui1.ui.theme.TextWhite
import com.star.whatsappui1.ui.theme.TopNav

@Composable
fun TopNav() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .background(TopNav)
            .padding(start = 14.dp)
    ){

        Row(
            modifier = Modifier
                .fillMaxWidth()
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {


            //whatapp text
            Box(contentAlignment = Alignment.CenterStart) {
                Text(
                    text = "WhatsApp",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = TextWhite
                )
            }

            //camera logo and more button
            Box(
                contentAlignment = Alignment.CenterEnd,
                modifier = Modifier
                    .padding(15.dp),
            ) {

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.camera_24),
                        contentDescription = "camera",
                        tint = TextWhite,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .clickable { }
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.baseline_search_24),
                        contentDescription = "more",
                        tint = TextWhite,
                        modifier = Modifier
                            .size(34.dp)
                            .padding(end = 10.dp)
                            .clickable { }
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.baseline_more_vert_24),
                        contentDescription = "more",
                        tint = TextWhite,
                        modifier = Modifier
                            .size(34.dp)
                            .padding(start = 8.dp, end = 5.dp)
                            .clickable { }
                    )
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Text(
                text = "Chats",
                color = Color.White,
                modifier = Modifier
                    .clickable {  }
            )
            Text(
                text = "Status",
                color = Color.White,
                modifier = Modifier
                    .clickable {  },)
            Text(
                text = "Calls",
                color = Color.White ,
                modifier = Modifier
                        .clickable {  },)
        }
    }

}



@Preview
@Composable
fun TopNavPreview() {
    TopNav()
}