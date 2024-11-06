package com.example.android_foryou.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController) {


    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 96.dp),
            verticalArrangement = Arrangement.spacedBy(35.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .shadow(
                        elevation = 4.dp,
                        spotColor = Color(0x14000000),
                        ambientColor = Color(0x14000000)
                    )
                    .width(375.dp)
                    .height(153.dp)
                    .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 25.dp))
                    .padding(start = 15.dp, top = 33.dp, end = 15.dp, bottom = 33.dp),
                horizontalArrangement = Arrangement.spacedBy(241.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.Bottom,
            ) {
                // Child views.
            }
        }
    }
}

@Preview
@Composable
fun HomePreView() {
    HomeScreen(navController = rememberNavController())
}