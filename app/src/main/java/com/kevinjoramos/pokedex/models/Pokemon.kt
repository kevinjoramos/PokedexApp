package com.kevinjoramos.pokedex.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Pokemon(
    @JsonProperty("id") val id: Int,
    @JsonProperty("name") val name: String,
    @JsonProperty("base_experience") val baseExperience: Int,
    @JsonProperty("height") val height: Int,
    @JsonProperty("is_default") val isDefault: Boolean,
    @JsonProperty("order") val order: Int,
    @JsonProperty("weight") val weight: Int,
    //@JsonProperty("abilities") val abilities: List<PokemonAbility>,
    //@JsonProperty("forms") val forms: List<String>, //TODO <- List<PokemonForm> instead of String.
    //@JsonProperty("held_items") val heldItems: List<PokemonHeldItem>,
    @JsonProperty("location_area_encounters") val habitatUrl: String,
    //@JsonProperty("moves") val moves: List<PokemonMove>,
    //@JsonProperty("past_types") val pastTypes: List<PokemonTypePast>,
    //@JsonProperty("sprites") val sprites: List<PokemonSprite>,
    //@JsonProperty("species") val species: List<PokemonSpecies>,
    //@JsonProperty("stats") val stats: List<PokemonStat>,
    //@JsonProperty("types") val types: List<PokemonType>
)

