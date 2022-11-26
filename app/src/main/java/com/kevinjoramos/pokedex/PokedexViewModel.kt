package com.kevinjoramos.pokedex

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kevinjoramos.pokedex.repository.PokedexRepository
import com.kevinjoramos.pokedex.repository.PokemonService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokedexViewModel : ViewModel() {

    private val repository = PokedexRepository(PokemonService())
    fun getPokemonData() {
        viewModelScope.launch(Dispatchers.IO) {
            Log.i("MESSAGE", "${repository.getClefairyData()}")
        }
    }
}