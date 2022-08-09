package com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.routes

open class NoParamsRoute(route: String) : Route<IRouteParams>(route) {

    override fun getRouteWithArguments(params: IRouteParams): String = route
}