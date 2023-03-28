package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class EvolutionDetail(
    @JsonProperty("gender") val gender: Int?,
    @JsonProperty("held_item") val heldItem: Item?,
    @JsonProperty("item") val item: Item?,
    @JsonProperty("known_move") val knownMove: MoveWrapper?,
    @JsonProperty("known_move_type") val knownMoveType: Type?,
    @JsonProperty("location") val location: Location?,
    @JsonProperty("min_affection") val minAffection: Int?,
    @JsonProperty("min_beauty") val minBeauty: Int?,
    @JsonProperty("min_happiness") val minHappiness: Int?,
    @JsonProperty("min_level") val minLevel: Int?,
    @JsonProperty("needs_overworld_rain") val needsOverworldRain: Boolean?,
    @JsonProperty("party_species") val partySpecies: SpeciesUrl?,
    @JsonProperty("party_type") val partyType: Type?,
    @JsonProperty("relative_physical_stats") val relativePhysicalStats: Int?,
    @JsonProperty("time_of_day") val time: String?,
    @JsonProperty("trade_species") val tradeSpecies: SpeciesUrl?,
    @JsonProperty("trigger") val trigger: Trigger,
)