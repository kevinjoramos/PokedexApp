package com.kevinjoramos.pokedex.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.kevinjoramos.pokedex.models.Pokemon
import com.kevinjoramos.pokedex.repository.PokedexRepository
import com.kevinjoramos.pokedex.repository.PokedexRepositoryImpl
import com.kevinjoramos.pokedex.repository.PokemonService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokedexViewModel @Inject constructor(
    private val pokedexRepository: PokedexRepository
): ViewModel() {

    //val pokemonData = liveData { pokedexRepository.getClefairyData()?.let { emit(it) } }
}