package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.Pokemon

class PokedexRepository(private val pokemonService: PokemonService) {

    suspend fun getClefairyData(): Pokemon? = pokemonService.successfulPokemonEntryResponse()
}

