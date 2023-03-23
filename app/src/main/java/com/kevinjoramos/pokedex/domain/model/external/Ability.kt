package com.kevinjoramos.pokedex.domain.model.external

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)