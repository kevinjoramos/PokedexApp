package com.kevinjoramos.pokedex.domain.model

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonOverviewEntry(
    @JsonProperty("name") val name: String,
    @JsonProperty("url") val url: String
)
