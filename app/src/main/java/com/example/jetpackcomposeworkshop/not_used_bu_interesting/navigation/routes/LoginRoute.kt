package com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.routes

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