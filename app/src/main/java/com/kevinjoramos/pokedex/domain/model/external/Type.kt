package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonProperty

data class Type(
    @JsonProperty("slot") val slot: Int,
    @JsonProperty("type")  val type: TypeX
)