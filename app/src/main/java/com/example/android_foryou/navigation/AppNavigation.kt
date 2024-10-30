package com.example.android_foryou.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
            Screens.Interest.title
        ) {


        }

        composable(
            Screens.SignupInfo.title
        ) {

        }

        composable(
            Screens.SignupDetail1.title
        ) {


        }

        composable(
            Screens.SignupDetail2.title
        ) {

        }


    }
}