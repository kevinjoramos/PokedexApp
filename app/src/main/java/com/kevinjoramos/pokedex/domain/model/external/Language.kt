package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Language(
    @JsonProperty("name") val name: String,
    @JsonProperty("url") val url: String
)