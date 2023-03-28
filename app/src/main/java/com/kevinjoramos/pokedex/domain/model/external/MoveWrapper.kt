package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class MoveWrapper(
    @JsonProperty("move") val move: Move,
    @JsonProperty("version_group_details") val versionGroupDetails: List<VersionGroupDetail>
)