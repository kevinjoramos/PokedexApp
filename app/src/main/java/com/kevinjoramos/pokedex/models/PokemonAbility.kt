package com.kevinjoramos.pokedex.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonAbility(
    @JsonProperty("is_hidden") val isHidden: Boolean,
    @JsonProperty("slot") val slot: Int,
    @JsonProperty("ability") val ability: String //TODO <- ability obj. instead of string.
)
