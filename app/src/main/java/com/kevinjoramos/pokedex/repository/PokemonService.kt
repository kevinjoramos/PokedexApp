package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.Pokemon
import retrofit2.Retrofit

class PokemonService() {

    private val retrofit = RetrofitClient("https://pokeapi.co/api/v2/").getClient()
    private val pokemonApi = retrofit.create(PokemonApi::class.java)

    suspend fun successfulPokemonEntryResponse(): Pokemon? {
        val pokemonResponse = pokemonApi.getPokemon()
        return pokemonResponse.body()
    }
}