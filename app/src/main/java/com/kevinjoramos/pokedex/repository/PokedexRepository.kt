package com.kevinjoramos.pokedex.repository

interface PokedexRepository {
    suspend fun getAllPokemonNamesAndIds()
    suspend fun getIndividualPokemonData()
}