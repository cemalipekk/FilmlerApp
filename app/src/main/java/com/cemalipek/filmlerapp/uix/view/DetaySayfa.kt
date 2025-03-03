package com.cemalipek.filmlerapp.uix.view

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cemalipek.filmlerapp.data.entity.Filmler

@SuppressLint("ContextCastToActivity")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetaySayfa(gelenFilmler : Filmler){
    Scaffold(
        topBar = { TopAppBar(title = { Text(gelenFilmler.ad) }) },
    ) { paddingValues ->

        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val activity = (LocalContext.current as Activity)
            Image(bitmap = ImageBitmap.imageResource(
                id = activity.resources.getIdentifier(
                    gelenFilmler.resim,
                    "drawable",
                    activity.packageName
                )
            ), contentDescription = "",
                modifier = Modifier.size(200.dp, 300.dp))
            Text("${gelenFilmler.fiyat} ₺", fontSize = 50.sp)
        }
    }

}