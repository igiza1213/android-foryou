package com.example.android_foryou.screens.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.android_foryou.R

@Composable
fun SigninScreen(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .width(37.dp)
                        .height(34.dp)
                )
                Text(
                    text = "로그인",
                    fontSize = 18.sp,
                    lineHeight = 21.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            OutlinedTextField(
                modifier = Modifier.width(325.dp),
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "email") })

            OutlinedTextField(
                modifier = Modifier.width(325.dp),
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "password") })

            Column(verticalArrangement = Arrangement.spacedBy(9.dp, Alignment.Top)) {

            }
        }
    }
}

@Preview
@Composable
fun SigninPreView() {
    SigninScreen(navController = rememberNavController())
}