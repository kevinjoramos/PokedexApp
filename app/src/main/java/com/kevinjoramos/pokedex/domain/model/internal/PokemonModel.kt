package com.kevinjoramos.pokedex.domain.model.internal

data class PokemonModel(
    val id: Int,
    val name: String,
    val sprite: String,
    val types: List<String>,
    val isFavorite: Boolean,
    val about: About,
    val baseStats: BaseStats,
    val evolution: List<Evolution>,
    val moves: List<Move>
    ) {

    data class About(
        val species: String,
        val height: Int,
        val weight: Int,
        val abilities: List<String>,
        val breeding: Breeding,
        val baseExperience: Int
    )

    data class Breeding(
        val genderRate: Int,
        val eggGroups: String,
    )

    data class BaseStats(
        val hp: Int,
        val attack: Int,
        val defense: Int,
        val spAtk: Int,
        val spDef: Int,
        val speed: Int,
        val defenses: List<TypeWeighted>,
        val advantages: List<TypeWeighted>
    )

    data class TypeWeighted(
        val name: String,
        val weight: Float
    )

    data class Evolution(
        val before: String,
        val after: String,
        val requirementLevel: Int,
        val otherRequirements: List<String>
    )

    data class Move(
        val name: String,
        val levelLearned: Int,
    )
}
