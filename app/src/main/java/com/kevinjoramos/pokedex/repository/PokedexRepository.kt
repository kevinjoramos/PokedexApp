package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.NetworkResult
import com.kevinjoramos.pokedex.models.overview.PokemonOverview

interface PokedexRepository {
    suspend fun getAllPokemonNamesAndIds(): NetworkResult<PokemonOverview>
    suspend fun getIndividualPokemonData()
}