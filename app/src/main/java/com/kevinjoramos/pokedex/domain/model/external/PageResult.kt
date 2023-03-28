package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonProperty

data class PageResult(
    @JsonProperty("name") val name: String,
    @JsonProperty("url") val url: String
)