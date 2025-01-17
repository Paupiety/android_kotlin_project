package com.example.films_project

import android.os.Bundle
import android.view.Gravity
import android.widget.EditText
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.films_project.Data.Entity.MovieFav
import com.example.films_project.ui.compose.HomeScreen.HomeScreen
import com.example.films_project.ui.compose.HomeScreen.HomeScreenViewModel
import com.example.films_project.ui.compose.search.SearchScreen
import com.example.films_project.ui.theme.Films_projectTheme

class MainActivity : ComponentActivity() {

    private lateinit var HomeScreenViewModel: HomeScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Films_projectTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                        Column(
                            modifier = Modifier
                                .background(Color.Black)
                                .padding(top = innerPadding.calculateTopPadding(),
                                    start = innerPadding.calculateLeftPadding(LocalLayoutDirection.current) + 20.dp,
                                    end = innerPadding.calculateRightPadding(LocalLayoutDirection.current) + 20.dp,
                                    bottom = 50.dp)
                                .fillMaxSize()
                        ) {
                            val navController = rememberNavController()
                            NavHost(
                                navController = navController,
                                startDestination = "homeScreen"
                            ) {
                                composable("homeScreen") { HomeScreen(navController) }
                                composable("searchScreen") { SearchScreen(navController) }
                            }
                        }

                    }
                }

            }
        }
    }