package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.Pokemon
import retrofit2.Retrofit
import javax.inject.Inject

class PokemonService @Inject constructor(
    private val pokemonApi: PokemonApi
) {

    suspend fun successfulAllPokemonNamesAndIdsResponse(): Pokemon? {
        val data = pokemonApi.getAllPokemonNamesAndIds()
        return data.body()
    }

    suspend fun successfulIndividualPokemonDataResponse(pokemon_Id: String): Pokemon? {
        val data = pokemonApi.getIndividualPokemonData(pokemon_Id)
        return data.body()
    }
}