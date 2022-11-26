package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.Pokemon
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("pokemon/clefairy")
    suspend fun getPokemon(): Response<Pokemon>
}