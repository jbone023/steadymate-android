package com.steadymate.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.steadymate.app.navigation.SteadyMateNavigation
import com.steadymate.app.ui.theme.MasculineDarkTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MasculineDarkTheme {
                SteadyMateNavigation(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
