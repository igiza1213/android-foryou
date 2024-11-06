package com.example.android_foryou.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.android_foryou.R

@Composable
fun HomeScreen(navController: NavController) {


    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(35.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .shadow(
                        elevation = 10.dp,
                        spotColor = Color(0xAA000000),
                        ambientColor = Color(0xAA000000)
                    )
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 25.dp))
                    .padding(),
                horizontalArrangement = Arrangement.spacedBy(241.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "logo",
                        modifier = Modifier
                            .width(37.dp)
                            .height(34.dp)
                    )
                    Text(
                        text = "회원가입",
                        fontSize = 18.sp,
                        lineHeight = 21.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFEA8895),
                    )

                    Image(
                        painter = painterResource(id = R.drawable.vector),
                        contentDescription = "image description",
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HomePreView() {
    HomeScreen(navController = rememberNavController())
}