package com.example.android_foryou.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android_foryou.screens.home.HomeScreen
import com.example.android_foryou.screens.home.SignupDetailScreen
import com.example.android_foryou.screens.home.SignupInfoScreen
import com.example.android_foryou.screens.signin.SigninScreen


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Signin.title
    ) {

        composable(
            Screens.Signin.title,
        ) {
            SigninScreen(navController = navController)
        }

        composable(
            Screens.Home.title
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            Screens.SignupInfo.title
        ) {
            SignupInfoScreen(navController = navController)
        }

        composable(
            Screens.SignupDetail.title
        ) {
            SignupDetailScreen(navController = navController)
        }




    }
}