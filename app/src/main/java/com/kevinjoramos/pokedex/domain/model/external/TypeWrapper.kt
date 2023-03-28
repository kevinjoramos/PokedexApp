package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class TypeWrapper(
    @JsonProperty("slot") val slot: Int,
    @JsonProperty("type")  val type: Type
)