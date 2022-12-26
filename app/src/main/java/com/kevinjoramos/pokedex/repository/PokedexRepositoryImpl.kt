package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.Pokemon
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class PokedexRepositoryImpl @Inject constructor(
    private val pokemonService: PokemonService
): PokedexRepository {

    override suspend fun getAllPokemonNamesAndIds() {
        TODO("Not yet implemented")
    }

    override suspend fun getIndividualPokemonData() {
        TODO("Not yet implemented")
    }
}

