package com.example.jetpackcomposeworkshop.navigation.routes

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink


sealed class Route<P : IRouteParams>(val route: String) {
    open val fullRoute = route
    open val arguments: List<NamedNavArgument> = emptyList()
    open val deepLinks: List<NavDeepLink> = emptyList()

    abstract fun getRouteWithArguments(params: P): String
}