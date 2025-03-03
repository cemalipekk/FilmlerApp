package com.cemalipek.filmlerapp.uix.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SayfaGecisleri(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "anasayfa") {
        composable("anasayfa"){
            Anasayfa(navController)
        }

        composable("detaySayfa"){
            DetaySayfa()
        }
    }

}