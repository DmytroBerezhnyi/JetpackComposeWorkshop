package com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.routes.IRouteParams
import com.example.jetpackcomposeworkshop.not_used_bu_interesting.navigation.routes.Route

fun NavGraphBuilder.composable(
    route: Route<out IRouteParams>,
    content: @Composable (NavBackStackEntry) -> Unit
) {
    composable(
        route = route.fullRoute,
        arguments = route.arguments,
        deepLinks = route.deepLinks,
        content = content
    )
}