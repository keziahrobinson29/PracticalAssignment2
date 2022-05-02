package com.example.practical

sealed class NavRoutes(val route: String) {
    object HomeScreen : NavRoutes("HomeScreen")
    object Details : NavRoutes("Details")

}
