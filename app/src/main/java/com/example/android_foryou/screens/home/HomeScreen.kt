package com.example.android_foryou.screens.home

import android.widget.HorizontalScrollView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
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
            verticalArrangement = Arrangement.spacedBy(22.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TopCard()
            BottomCard()
        }
    }
}

@Composable
fun TopCard() {
    Row(
        modifier = Modifier
            .shadow(
                elevation = 10.dp,
                spotColor = Color(0xAA000000),
                ambientColor = Color(0xAA000000)
            )
            .fillMaxWidth()
            .height(120.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 25.dp))
            .padding(),
        horizontalArrangement = Arrangement.spacedBy(241.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
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


        }

        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "image description",
            modifier = Modifier
                .padding(2.dp)
                .width(14.dp)
                .height(18.dp)
        )
    }
}

@Composable
fun BottomCard() {
    Column(
        modifier = Modifier
            .shadow(
                elevation = 10.dp,
                spotColor = Color(0xAA000000),
                ambientColor = Color(0xAA000000)
            )
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 25.dp))
            .padding(horizontal = 23.dp, vertical = 14.dp),

        ) {
        Text(
            text = "선호도 Top 5",
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(19.dp))

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            HomeData.hotItems.forEachIndexed { _, hotModel ->
                Column(
                    modifier = Modifier
                        .shadow(
                            elevation = 4.dp,
                            spotColor = Color(0x40000000),
                            ambientColor = Color(0x40000000)
                        )
                        .width(167.dp)
                        .height(209.dp)
                        .paint(
                            painter = painterResource(id = hotModel.image),
                            contentScale = ContentScale.FillBounds
                        )
                        .padding(bottom = 16.dp, start = 12.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Column {
                        Text(
                            text = hotModel.title,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF),
                            fontSize = 25.sp
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.white_heart),
                                contentDescription = "heart",
                                modifier = Modifier
                                    .width(14.dp)
                                    .height(14.dp)
                            )

                            Spacer(Modifier.width(5.dp))

                            Text(
                                text = hotModel.good + "K",
                                fontWeight = FontWeight.Normal,
                                color = Color(0xFFFFFFFF),
                                fontSize = 12.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))
            }
        }

        Spacer(Modifier.height(38.dp))

        Column {
            HomeData.listItems.forEachIndexed { _, listModel ->
                ListCard(listModel)
                Divider(thickness = 2.dp, modifier = Modifier.padding(vertical = 15.dp))
            }
        }
    }

}

@Composable
fun ListCard(listModel: ListModel) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
        verticalAlignment = Alignment.Top,
    ) {
        Image(
            painter = painterResource(id = listModel.image),
            contentDescription = "image",
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
        )


        Column {
            Text(
                text = listModel.title,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )

            Spacer(Modifier.height(6.dp))

            Text(
                text = listModel.description,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                color = Color(0xFF959595)
            )

            Spacer(Modifier.height(19.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.pink_heart),
                    contentDescription = "heart",
                    modifier = Modifier
                        .width(14.dp)
                        .height(14.dp),
                )

                Spacer(Modifier.width(3.dp))

                Text(
                    text = (listModel.good).toString(),
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFFEA8895),
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun HomePreView() {
    HomeScreen(navController = rememberNavController())
}