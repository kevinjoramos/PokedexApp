package com.kevinjoramos.pokedex.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kevinjoramos.pokedex.models.NetworkResult
import com.kevinjoramos.pokedex.repository.PokedexRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class PokedexViewModel @Inject constructor(
    private val pokedexRepository: PokedexRepository
): ViewModel() {

    val pokemonOverViewData = liveData {
            emit(NetworkResult.Loading("Pokemon Overview Loading..."))
            withContext(Dispatchers.IO) { emit(pokedexRepository.getAllPokemonNamesAndIds()) }
        }
}