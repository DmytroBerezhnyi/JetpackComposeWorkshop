package com.example.jetpackcomposeworkshop.navigation.routes

import androidx.navigation.NavController

object LoginRoute : NoParamsRoute(route = "Login") {

    fun navigateToMainScreen(navController: NavController) {
        navController.navigate(MainRoute.route) {
            popUpTo(route) {
                inclusive = true
            }
        }
    }
}