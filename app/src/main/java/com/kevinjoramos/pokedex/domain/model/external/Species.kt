package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonProperty

data class Species(
    @JsonProperty("name") val name: String,
    @JsonProperty("url") val url: String
)