package com.kevinjoramos.pokedex.repository

import com.kevinjoramos.pokedex.models.NetworkResult
import com.kevinjoramos.pokedex.models.overview.PokemonOverview
import javax.inject.Inject

class PokedexRepositoryImpl @Inject constructor(
    private val pokemonService: PokemonService
): PokedexRepository {

    //suspend fun getClefairyData(): Pokemon? = pokemonService.successfulPokemonEntryResponse()

    override suspend fun getAllPokemonNamesAndIds(): NetworkResult<PokemonOverview> {
        val response = pokemonService.successfulAllPokemonNamesAndIdsResponse()
        val body = response.body()
        return if (response.isSuccessful) {
            if (body != null) NetworkResult.Success(body) else NetworkResult.Error(response.code(), null, null)
        } else {
            NetworkResult.Error(response.code(), response.message(), null)
        }
    }

    override suspend fun getIndividualPokemonData() {
        TODO("Not yet implemented")
    }
}

