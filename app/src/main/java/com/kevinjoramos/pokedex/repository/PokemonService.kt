package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.Pokemon
import com.kevinjoramos.pokedex.models.overview.PokemonOverview
import retrofit2.Response
import javax.inject.Inject

class PokemonService @Inject constructor(
    private val pokemonApi: PokemonApi
) {

    suspend fun successfulAllPokemonNamesAndIdsResponse(): Response<PokemonOverview> {
        return pokemonApi.getAllPokemonNamesAndIds()
    }

    suspend fun successfulIndividualPokemonDataResponse(pokemon_Id: String): Response<Pokemon?> {
        return pokemonApi.getIndividualPokemonData(pokemon_Id)
    }
}