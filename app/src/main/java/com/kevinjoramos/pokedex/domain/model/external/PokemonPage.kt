package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonPage(
    @JsonProperty("count") val count: Int,
    @JsonProperty("next") val next: String,
    @JsonProperty("previous") val previous: Any,
    @JsonProperty("results") val results: List<PageResult>
)