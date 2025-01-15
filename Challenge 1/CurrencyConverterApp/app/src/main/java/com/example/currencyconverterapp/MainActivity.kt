package com.example.currencyconverterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.currencyconverterapp.presentation.main_screen.MainScreen
import com.example.currencyconverterapp.presentation.main_screen.MainScreenViewModel
import com.example.currencyconverterapp.presentation.theme.CurrencyConverterAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyConverterAppTheme {
                val viewModel: MainScreenViewModel = hiltViewModel()
                Surface {
                    MainScreen(
                        state = viewModel.state,
                        onEvent = viewModel::onEvent
                    )
                }
            }
        }
    }
}

