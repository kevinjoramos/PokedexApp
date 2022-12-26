package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.constants.ApiConstants
import com.kevinjoramos.pokedex.models.Pokemon
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {
    @GET(ApiConstants.POKEMON_OVERVIEW_URL + ApiConstants.POKEMON_COUNT)
    suspend fun getAllPokemonNamesAndIds(): Response<Pokemon>

    @GET("${ApiConstants.POKEMON_INDIVIDUAL_URL}/{pokemon_id}")
    suspend fun getIndividualPokemonData(@Path("pokemon_id") pokemon_id: String): Response<Pokemon>
}