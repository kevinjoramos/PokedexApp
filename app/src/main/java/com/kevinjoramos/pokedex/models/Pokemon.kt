package com.kevinjoramos.pokedex.models

data class Pokemon(
    val id: Int,
    val name: String,
    val baseExperience: Int,
    val height: Int,
    val isDefault: Boolean,
    val order: Int,
    val weight: Int,
    val abilities: List<PokemonAbility>,
    val forms: List<PokemonForm>,
    val heldItems: List<PokemonHeldItem>,
    val habitatUrl: String,
    val moves: List<PokemonMove>,
    val pastTypes: List<PokemonTypePast>,
    val sprites: List<PokemonSprite>,
    val species: List<PokemonSpecies>,
    val stats: List<PokemonStat>,
    val types: List<PokemonType>
)

