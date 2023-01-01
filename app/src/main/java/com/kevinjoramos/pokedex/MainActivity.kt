package com.kevinjoramos.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.kevinjoramos.pokedex.ui.theme.PokedexTheme
import com.kevinjoramos.pokedex.viewmodel.PokedexViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    //font Archivo Black https://fonts.google.com/specimen/Archivo+Black?preview.text=Pokedex&preview.text_type=custom&thickness=8
    //font ui numbering https://fonts.google.com/specimen/Kanit?preview.text=%23001&preview.text_type=custom&thickness=8

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = Color.White,
                        darkIcons = true
                    )
                }
                TopLevel()
            }
        }
    }
}

@Composable
fun TopLevel(model: PokedexViewModel = viewModel()) {
    val pokemonOverview = model.pokemonOverViewData.observeAsState()
    PokemonScreenComposable(pokemonOverview)
}