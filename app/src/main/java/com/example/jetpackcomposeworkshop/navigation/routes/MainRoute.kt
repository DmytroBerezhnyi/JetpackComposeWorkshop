package com.example.jetpackcomposeworkshop.navigation.routes

import androidx.navigation.NavController

object MainRoute : NoParamsRoute(route = "RequestsList") {

    fun navigateToCharacterDetails(
        navController: NavController,
        params: CharacterDetailsRoute.Params
    ) {
        navController.navigate(CharacterDetailsRoute.getRouteWithArguments(params))
    }
}