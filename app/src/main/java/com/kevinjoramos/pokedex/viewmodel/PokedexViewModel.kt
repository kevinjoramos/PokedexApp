package com.kevinjoramos.pokedex.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.kevinjoramos.pokedex.models.Pokemon
import com.kevinjoramos.pokedex.repository.PokedexRepository
import com.kevinjoramos.pokedex.repository.PokemonService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokedexViewModel : ViewModel() {

    private val repository = PokedexRepository(PokemonService())

    val pokemonData = liveData { repository.getClefairyData()?.let { emit(it) } }
}