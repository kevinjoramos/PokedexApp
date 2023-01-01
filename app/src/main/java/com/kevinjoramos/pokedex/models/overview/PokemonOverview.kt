package com.kevinjoramos.pokedex.models.overview

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PokemonOverview(
    @JsonProperty("results") val pokemonOverviewEntryList: List<PokemonOverviewEntry>
)