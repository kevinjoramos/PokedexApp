package com.kevinjoramos.pokedex.data.remote

import com.kevinjoramos.pokedex.domain.model.Pokemon
import com.kevinjoramos.pokedex.domain.model.PokemonOverview
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