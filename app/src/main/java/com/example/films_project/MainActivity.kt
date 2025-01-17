package com.example.films_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.films_project.ui.compose.search.SearchScreen
import com.example.films_project.ui.theme.Films_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Films_projectTheme {
        Greeting("Android")
    }
}