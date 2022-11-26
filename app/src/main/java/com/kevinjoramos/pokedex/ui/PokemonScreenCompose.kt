package com.kevinjoramos.pokedex

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kevinjoramos.pokedex.models.Pokemon

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PokemonScreenComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifiergit 
                .padding(top = 32.dp, start = 16.dp, end = 16.dp)
                .fillMaxSize()
                .background(Color.Gray)
        ) {
            Text(text = "Pokedex", style = TextStyle(fontSize = 32.sp))
            Spacer(modifier = Modifier.height(32.dp))
            PokemonLazyColumn(pokemonList = (1..15).toList())
        }
    }
}

@Composable
fun PokemonLazyColumn(pokemonList: List<Int>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(pokemonList.size) { pokemon->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan),
            ) {
                EntryCard(pokemon, Modifier.weight(1f))
                Spacer(modifier = Modifier.width(16.dp))
                EntryCard(pokemon, Modifier.weight(1f))
            }

        }
    }
}

@Composable
fun EntryCard(pokemon: Int, modifier: Modifier) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        modifier = modifier
    ) {
        Text(
            text = pokemon.toString(),
            style = TextStyle(fontSize = 25.sp),
            modifier = Modifier.padding(16.dp)

        )
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