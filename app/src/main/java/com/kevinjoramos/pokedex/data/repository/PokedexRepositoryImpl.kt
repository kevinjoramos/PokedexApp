package com.kevinjoramos.pokedex.data.repository

import com.kevinjoramos.pokedex.data.remote.NetworkResult
import com.kevinjoramos.pokedex.domain.model.PokemonOverview
import com.kevinjoramos.pokedex.domain.repository.PokemonDataRepository
import com.kevinjoramos.pokedex.data.remote.PokemonService
import javax.inject.Inject

class PokedexRepositoryImpl @Inject constructor(
    private val pokemonService: PokemonService
): PokemonDataRepository {

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

