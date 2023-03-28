package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Pokemon(
    @JsonProperty("abilities") val abilities: List<AbilityWrapper>,
    @JsonProperty("base_experience") val baseExperience: Int,
    @JsonProperty("height") val height: Int,
    @JsonProperty("id") val id: Int,
    @JsonProperty("moves") val moves: List<MoveWrapper>,
    @JsonProperty("name") val name: String,
    @JsonProperty("species") val species: SpeciesUrl,
    @JsonProperty("sprites") val sprites: Sprites,
    @JsonProperty("stats") val stats: List<Stat>,
    @JsonProperty("types") val types: List<TypeWrapper>,
    @JsonProperty("weight") val weight: Int
)