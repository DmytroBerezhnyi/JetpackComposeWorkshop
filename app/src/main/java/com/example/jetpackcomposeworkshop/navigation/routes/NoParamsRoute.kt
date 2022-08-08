package com.example.jetpackcomposeworkshop.navigation.routes

open class NoParamsRoute(route: String) : Route<IRouteParams>(route) {

    override fun getRouteWithArguments(params: IRouteParams): String = route
}