package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Genera(
    @JsonProperty("genus") val genus: String,
    @JsonProperty("language") val language: Language
)