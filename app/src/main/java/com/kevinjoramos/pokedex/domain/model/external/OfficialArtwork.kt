package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class OfficialArtwork(
    @JsonProperty("front_default") val frontDefault: String,
    @JsonProperty("front_shiny") val frontShiny: String
)