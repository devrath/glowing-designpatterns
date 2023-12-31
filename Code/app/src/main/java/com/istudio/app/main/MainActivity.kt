package com.istudio.app.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.istudio.app.R
import com.istudio.app.main.selection.ModuleDemo
import com.istudio.app.ui.theme.GlowingDesignPatternsTheme
import com.istudio.app.main.selection.ModuleSelectionScreen
import com.istudio.app.patterns.builder.BuilderDemo
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlowingDesignPatternsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Scaffold(
                        topBar = {
                            Toolbar()
                        },
                        content = {
                            // Content of your screen goes here
                            val navController = rememberNavController()

                            NavHost(
                                modifier = Modifier.padding(it),
                                navController = navController,
                                startDestination = ModuleDemo.DemoSelection.rout
                            ) {
                                // Selection Screen
                                composable(ModuleDemo.DemoSelection.rout) {
                                    ModuleSelectionScreen(navController = navController)
                                }
                                // DESIGN PRINCIPLE: Builder
                                composable(ModuleDemo.BuilderDemo.rout) {
                                    BuilderDemo(navController = navController)
                                }
                            }
                        }
                    )
                }
            }
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Toolbar() {
        TopAppBar(
            title = {
                Text(
                    text = stringResource(id = R.string.app_name),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            },
            navigationIcon = {
                IconButton(onClick = { /* Handle navigation icon click */ }) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = null)
                }
            },
            modifier = Modifier.background(color = MaterialTheme.colorScheme.primary)
        )
    }
}