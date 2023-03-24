package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Stat(
    @JsonProperty("base_stat") val baseStat: Int,
    @JsonProperty("stat") val stat: StatX
)