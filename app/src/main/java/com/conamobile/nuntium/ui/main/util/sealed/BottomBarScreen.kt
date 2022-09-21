package com.conamobile.nuntium.ui.main.util.sealed

import androidx.annotation.DrawableRes
import com.conamobile.nuntium.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    @DrawableRes val icon: Int,
    @DrawableRes val unselectedIcon: Int,
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.ic_home,
        unselectedIcon = R.drawable.ic_home_unselected
    )

    object Categories : BottomBarScreen(
        route = "categories",
        title = "Categories",
        icon = R.drawable.ic_categories,
        unselectedIcon = R.drawable.ic_categories_unselected
    )

    object Bookmarks : BottomBarScreen(
        route = "bookmarks",
        title = "Bookmarks",
        icon = R.drawable.ic_bookmarks,
        unselectedIcon = R.drawable.ic_bookmarks_unselected
    )

    object Settings : BottomBarScreen(
        route = "settings",
        title = "Settings",
        icon = R.drawable.ic_settings,
        unselectedIcon = R.drawable.ic_settings_unselected
    )
}