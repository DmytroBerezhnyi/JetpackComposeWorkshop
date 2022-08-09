package com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.routes

import androidx.navigation.NavType
import androidx.navigation.navArgument

object CharacterDetailsRoute : Route<CharacterDetailsRoute.Params>("CharacterDetails") {
    private const val argName1 = "itemId"

    override val fullRoute: String
        get() = "$route/{$argName1}"

    private val argument1 = navArgument(argName1) {
        type = NavType.StringType
        defaultValue = ""
        nullable = false
    }

    override val arguments = listOf(argument1)

    override fun getRouteWithArguments(params: Params): String {
        return "$route/${params.itemId}"
    }

    data class Params(val itemId: String) : IRouteParams
}