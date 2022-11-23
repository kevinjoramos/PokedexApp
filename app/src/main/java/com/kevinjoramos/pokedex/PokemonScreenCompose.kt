package com.kevinjoramos.pokedex

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PokemonScreenComposable() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxSize()
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxHeight(.5f)
        )
        Card(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            elevation = 10.dp,
            shape = RoundedCornerShape(10.dp)
        ) {

        }
    }
}