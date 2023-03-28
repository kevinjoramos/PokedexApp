package com.kevinjoramos.pokedex.domain.model.external

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class VersionGroupDetail(
    @JsonProperty("level_learned_at") val levelLearnedAt: Int,
    @JsonProperty("move_learn_method") val moveLearnMethod: MoveLearnMethod,
    @JsonProperty("version_group") val versionGroup: VersionGroup
)