package com.example.jetpackcomposeworkshop.navigation.routes

import androidx.navigation.NavController

object SplashRoute : NoParamsRoute(route = "Splash") {

    fun navigateToLoginRouteScreen(navController: NavController) {
        navController.navigate(LoginRoute.route) {
            popUpTo(route) {
                inclusive = true
            }
        }
    }
}