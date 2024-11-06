package com.example.android_foryou.screens.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.android_foryou.R
import com.example.android_foryou.navigation.Screens
import com.example.android_foryou.ui.widget.AuthButton

@Composable
fun SigninScreen(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                modifier = Modifier.padding(top = 96.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
                label = { Text(text = "이메일") })

            OutlinedTextField(
                modifier = Modifier.width(325.dp),
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "비밀번호") })

            Column(verticalArrangement = Arrangement.spacedBy(9.dp, Alignment.Top)) {
                AuthButton(
                    text = "Login",
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFE98995),
                    ),
                    onClick = {
                        navController.navigate(Screens.Home.title)
                    }
                )
                AuthButton(
                    text = "Sign up",
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFF4BD),
                        contentColor = Color(0xFFE98995)
                    ),
                    onClick = {
                        navController.navigate(Screens.SignupInfo.title)
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun SigninPreView() {
    SigninScreen(navController = rememberNavController())
}