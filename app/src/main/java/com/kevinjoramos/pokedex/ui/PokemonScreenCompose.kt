package com.kevinjoramos.pokedex

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PokemonScreenComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 32.dp, start = 16.dp, end = 16.dp)
                .fillMaxSize()
                .background(Color.Gray)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Pokedex", style = TextStyle(fontSize = 32.sp))
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

@Composable
fun Example() {
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