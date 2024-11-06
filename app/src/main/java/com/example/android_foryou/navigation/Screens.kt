package com.example.android_foryou.navigation

sealed class Screens(val title: String) {
    data object Signin : Screens("signin")
    data object Home : Screens("home")
    data object SignupInfo : Screens("signup_info")
    data object SignupDetail : Screens("signup_detail")

}