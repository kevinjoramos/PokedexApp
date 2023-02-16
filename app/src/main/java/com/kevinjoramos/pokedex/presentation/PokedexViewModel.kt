package com.kevinjoramos.pokedex.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kevinjoramos.pokedex.data.remote.NetworkResult
import com.kevinjoramos.pokedex.domain.repository.PokemonDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class PokedexViewModel @Inject constructor(
    private val pokemonDataRepository: PokemonDataRepository
): ViewModel() {

    val pokemonOverViewData = liveData {
            emit(NetworkResult.Loading("Pokemon Overview Loading..."))
            withContext(Dispatchers.IO) { emit(pokemonDataRepository.getAllPokemonNamesAndIds()) }
        }
}