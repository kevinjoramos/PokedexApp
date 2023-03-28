package com.kevinjoramos.pokedex.domain.model.internal

data class PokemonResultModel(
    val id: Int,
    val name: String,
    val spriteUrl: String,
    val types: List<String>
)