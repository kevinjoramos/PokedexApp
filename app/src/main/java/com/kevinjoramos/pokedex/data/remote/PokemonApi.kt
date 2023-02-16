package com.kevinjoramos.pokedex.data.remote

import com.kevinjoramos.pokedex.domain.model.Pokemon
import com.kevinjoramos.pokedex.domain.model.PokemonOverview
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {
    @GET(ApiConstants.POKEMON_OVERVIEW_URL + ApiConstants.POKEMON_COUNT)
    suspend fun getAllPokemonNamesAndIds(): Response<PokemonOverview>

    @GET("${ApiConstants.POKEMON_INDIVIDUAL_URL}/{pokemon_id}")
    suspend fun getIndividualPokemonData(@Path("pokemon_id") pokemon_id: String): Response<Pokemon?>
}