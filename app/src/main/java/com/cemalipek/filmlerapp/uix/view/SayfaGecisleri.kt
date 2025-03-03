package com.cemalipek.filmlerapp.uix.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.cemalipek.filmlerapp.data.entity.Filmler
import com.google.gson.Gson

@Composable
fun SayfaGecisleri(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "anasayfa") {
        composable("anasayfa"){
            Anasayfa(navController)
        }

        composable(
            "detaySayfa/{film}",
            arguments = listOf(
                navArgument("film"){type = NavType.StringType}
            )
            ){
            val json = it.arguments?.getString("film")
            val nesne = Gson().fromJson(json, Filmler::class.java)
            DetaySayfa(nesne)
        }
    }

}