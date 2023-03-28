package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Chain(
    @JsonProperty("evolution_details") val evolutionDetails: List<EvolutionDetail>,
    @JsonProperty("evolves_to") val nextEvolution: List<Chain>,
)