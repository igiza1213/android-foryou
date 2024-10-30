package com.example.android_foryou.navigation

sealed class Screens(val title: String) {
    object Signin : Screens("signin")
    object Interest : Screens("interest")
    object SignupInfo : Screens("signup_info")
    object SignupDetail1 : Screens("signup_detail1")
    object SignupDetail2 : Screens("signup_detail2")

}