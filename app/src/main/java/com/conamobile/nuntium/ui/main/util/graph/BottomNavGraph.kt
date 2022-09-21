package com.conamobile.nuntium.ui.main.util.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.conamobile.nuntium.ui.main.bookmarks.BookmarksScreen
import com.conamobile.nuntium.ui.main.categories.CategoriesScreen
import com.conamobile.nuntium.ui.main.home.HomeScreen
import com.conamobile.nuntium.ui.main.util.sealed.BottomBarScreen
import com.conamobile.nuntium.ui.main.settings.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Categories.route) {
            CategoriesScreen()
        }
        composable(route = BottomBarScreen.Bookmarks.route) {
            BookmarksScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}