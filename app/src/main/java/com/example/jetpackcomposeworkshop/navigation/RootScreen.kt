package com.example.jetpackcomposeworkshop.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeworkshop.navigation.routes.*
import com.example.jetpackcomposeworkshop.ui.theme.JetpackComposeWorkshopTheme
import com.example.jetpackcomposeworkshop.navigation.components.composable

@Composable
fun RootScreen() {
    val rootViewModel: RootViewModel = hiltViewModel()
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route


    JetpackComposeWorkshopTheme(darkTheme = false) {
        Scaffold { paddingValues ->
            NavHost(
                modifier = Modifier.padding(paddingValues),
                navController = navController,
                startDestination = SplashRoute.route
            ) {

                composable(SplashRoute) {
                    Text(
                        modifier = Modifier.clickable { SplashRoute.navigateToLoginRouteScreen(navController) },
                        text = "SplashRoute"
                    )
                }

                composable(LoginRoute) {
                    Text(text = "LoginRoute")
                }

                composable(route = MainRoute) {
                    Text(text = "MainRoute")
                }

                composable(route = CharacterDetailsRoute) {
                    Text(text = "CharacterDetailsRoute")
                }
            }
        }
    }
}

@Preview
@Composable
fun RootScreenPreview() {
    RootScreen()
}