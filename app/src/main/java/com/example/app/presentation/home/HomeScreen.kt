package com.example.app.presentation.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    navController: NavController,
) {
    LaunchedEffect(key1 = Unit) {
        println(">>>HomeScreen LaunchedEffect")
    }

    Text(text = "Android Base App")
}
