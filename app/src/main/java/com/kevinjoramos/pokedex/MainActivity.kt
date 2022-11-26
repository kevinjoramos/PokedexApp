package com.kevinjoramos.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kevinjoramos.pokedex.PokemonScreenComposable
import com.kevinjoramos.pokedex.ui.theme.PokedexTheme
import com.kevinjoramos.pokedex.viewmodel.PokedexViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: PokedexViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokemonScreenComposable()
        }
    }
}