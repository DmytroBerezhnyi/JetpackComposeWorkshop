package com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.routes

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