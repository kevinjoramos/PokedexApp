package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Sprites(
    val other: Other,
)