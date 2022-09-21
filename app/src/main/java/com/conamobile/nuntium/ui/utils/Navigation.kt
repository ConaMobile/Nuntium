package com.conamobile.nuntium.ui.utils

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.conamobile.nuntium.ui.login.favorite.FavoriteScreen
import com.conamobile.nuntium.ui.login.onboarding.OnBoardingScreen
import com.conamobile.nuntium.ui.login.welcome.WelcomeScreen
import com.conamobile.nuntium.ui.main.MainScreen

@ExperimentalAnimationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = Screen.OnBoardingScreen.route) {
        composable(
            route = Screen.OnBoardingScreen.route,
        ) {
            OnBoardingScreen(navController = navController)
        }
        composable(
            route = Screen.WelcomeScreen.route,
        ) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.FavoriteScreen.route) {
            FavoriteScreen(navController = navController)
        }
        composable(route = Screen.MainScreen.route) {
            MainScreen()
        }

    }
}