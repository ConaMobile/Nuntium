package com.conamobile.nuntium.ui.utils

sealed class Screen(val route: String) {
    object OnBoardingScreen : Screen("on_boarding_screen")
    object WelcomeScreen : Screen("welcome_screen")
    object FavoriteScreen : Screen("favorite_screen")
    object MainScreen : Screen("main_screen")
}
