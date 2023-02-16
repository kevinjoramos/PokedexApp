package com.kevinjoramos.pokedex.domain.model

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonHeldItem(
    @JsonProperty("item") val item: String, //TODO <- Item Obj not String.
    @JsonProperty("version_details") val versionDetails: String //TODO <- List<PokemonHeldItemVersion> instead of String.
)
