package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Species(
    @JsonProperty("egg_groups") val eggGroups: List<EggGroup>,
    @JsonProperty("evolution_chain") val evolutionChain: EvolutionChain,
    @JsonProperty("gender_rate") val genderRate: Int,
    @JsonProperty("genra") val genera: List<Genera>,
)