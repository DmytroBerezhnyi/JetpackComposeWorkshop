package com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.routes

import androidx.navigation.NavController

object MainRoute : NoParamsRoute(route = "RequestsList") {

    fun navigateToCharacterDetails(
        navController: NavController,
        params: CharacterDetailsRoute.Params
    ) {
        navController.navigate(CharacterDetailsRoute.getRouteWithArguments(params))
    }
}