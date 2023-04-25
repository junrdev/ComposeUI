package com.star.whatsappui1

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopNav() {

    Box(modifier = Modifier.fillMaxWidth()){

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
//                .padding(15.dp)
        ) {
            Text(
                text = "WhatsApp",
                fontSize = 10.sp,
                modifier = Modifier
                    .padding(7.5.dp)
            )

            Icon(
                painter = painterResource(id = R.drawable.camera_24),
                contentDescription = "camera icon",

            )
        }

        Row() {

        }
    }
}

@Preview
@Composable
fun TopNavPreview() {
    TopNav()
}