package com.kevinjoramos.pokedex.domain.model.external

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)