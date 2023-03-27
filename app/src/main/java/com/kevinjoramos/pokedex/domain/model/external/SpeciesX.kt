package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonProperty

data class SpeciesX(
    @JsonProperty("name") val name: String,
    @JsonProperty("url") val url: String
)