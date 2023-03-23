package com.kevinjoramos.pokedex.domain.repository

import com.kevinjoramos.pokedex.data.remote.NetworkResult
import com.kevinjoramos.pokedex.domain.model.old.PokemonOverview

interface PokemonDataRepository {
    suspend fun getAllPokemonNamesAndIds(): NetworkResult<PokemonOverview>
    suspend fun getIndividualPokemonData()
}