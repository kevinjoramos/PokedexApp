package com.kevinjoramos.pokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kevinjoramos.pokedex.models.Pokemon

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PokemonScreenComposable() {
    PokemonScreenBackground {
        Text(text = "Pokedex", style = TextStyle(fontSize = 32.sp))
        Spacer(modifier = Modifier.height(32.dp))
        PokemonLazyColumn(
            pokemonList = (listOf("Bulbasaur", "Charmander", "Ivysuar", "Venasuar", "Charmeoleon",
            "Charizard")))
    }

}

@Composable
fun PokemonScreenBackground(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        NavigationBar()
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxSize()
                .background(Color.White)
        ) {
            content()
        }
    }
}

@Composable
fun NavigationBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp)
    ) {
        IconButton(
            onClick = { /*TODO*/ },

            ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back"
            )
        }
        IconButton(
            onClick = { /*TODO*/ },

            ) {
            Icon(
                imageVector = Icons.Default.List,
                contentDescription = "Back"
            )
        }
    }
}

@Composable
fun PokemonLazyColumn(pokemonList: List<String>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(pokemonList.size) { pokemon->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                EntryCard(1, pokemonList[pokemon], listOf<String>(), Modifier.weight(1f))
                Spacer(modifier = Modifier.width(10.dp))
                EntryCard(1, pokemonList[pokemon], listOf<String>(), Modifier.weight(1f))            }

        }
    }
}

@Composable
fun EntryCard(id: Int, name: String, types: List<String>, modifier: Modifier) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        modifier = modifier,
        backgroundColor = Color(0xFF49d0b0)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Column() {
                Text(
                    text = name,
                    style = TextStyle(color = Color.White),
                    maxLines = 1
                )
                Spacer(modifier = Modifier.height(8.dp))
                TypePillShapedText(type = "Grass")
                Spacer(modifier = Modifier.height(6.dp))
                TypePillShapedText(type = "Poison")
                Spacer(modifier = Modifier.height(6.dp))
                TypePillShapedText(type = "Grass")
            }
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "#001")
            }
        }
    }
}

@Composable
fun TypePillShapedText(type: String) {
    Box(
        modifier = Modifier
            .background(Color(0xFF62e0ca), RoundedCornerShape(50)),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = type,
            style = TextStyle(color = Color.White, fontSize = 10.sp),
            maxLines = 1,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 1.dp)
        )
    }
}