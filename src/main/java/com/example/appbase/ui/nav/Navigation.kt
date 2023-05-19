package com.example.appbase.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.appbase.ui.HomeScreen
import com.example.appbase.ui.MoviesScreen
import com.example.appbase.ui.MusicScreen
import com.example.appbase.ui.ProfileScreen
import com.example.appbase.ui.fragment.screen.Seguimiento

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.Seguimiento.route) {
            Seguimiento()
        }
        composable(NavigationItem.Pago.route) {
            MusicScreen()
        }
        composable(NavigationItem.Cotizar.route) {
            MusicScreen()
        }
        /***
        composable(NavigationItem.Movies.route) {
            MoviesScreen()
        }
        ****/
        /***
        composable(NavigationItem.Books.route) {
        BooksScreen()
        }
         */
        /***
        composable(NavigationItem.Books.route) {
        BooksScreen()
        }
         */
        /****
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
        ****/
    }
}