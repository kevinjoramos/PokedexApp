package com.kevinjoramos.pokedex.models.overview

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonOverviewEntry(
    @JsonProperty("name") val name: String,
    @JsonProperty("url") val url: String
)
