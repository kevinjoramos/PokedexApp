package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Move(
    @JsonProperty("move") val move: MoveX,
    @JsonProperty("version_group_details") val versionGroupDetails: List<VersionGroupDetail>
)