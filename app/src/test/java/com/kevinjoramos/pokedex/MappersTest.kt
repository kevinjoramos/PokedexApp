package com.kevinjoramos.pokedex

import com.fasterxml.jackson.databind.ObjectMapper
import com.kevinjoramos.pokedex.domain.mappers.toPokemonEntryModel
import com.kevinjoramos.pokedex.domain.model.external.Pokemon
import com.kevinjoramos.pokedex.domain.model.internal.PokemonModel
import org.junit.Assert
import org.junit.Test
import java.io.File

class MappersTest {
    private val mapper = ObjectMapper()

    private val bulbasaur: Pokemon =
        mapper.readValue(File("resources/bulbasaur.json"), Pokemon::class.java)

    private val mantyke: Pokemon =
        mapper.readValue(File("resources/mantyke.json"), Pokemon::class.java)

    private val onix: Pokemon =
        mapper.readValue(File("resources/onix.json"), Pokemon::class.java)

    private val machop: Pokemon =
        mapper.readValue(File("resources/machop.json"), Pokemon::class.java)

    private val eevee: Pokemon =
        mapper.readValue(File("resources/eevee.json"), Pokemon::class.java)


    @Test
    /*
    Basic test that mapper works as intended for general use.
     */
    fun bulbasaurToPokemonModel() {
        val expected = PokemonModel(
            id = 1,
            name = "bulbasaur",
            sprite = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png",
            types = listOf("grass", "poison"),
            isFavorite = false,
            about =  PokemonModel.About(
                species = "seed",
                height = 7,
                weight = 69,
                abilities = listOf("overgrow", "chlorophyll"),
                breeding = PokemonModel.Breeding(
                    genderRate = 1,
                    eggGroups = "Monster",
                ),
                baseExperience = 64
            ),
            baseStats = PokemonModel.BaseStats(
                hp = 45,
                attack = 49,
                defense = 49,
                spAtk = 65,
                spDef = 65,
                speed = 45,
                defenses = listOf(
                    PokemonModel.TypeWeighted(
                        name = "bug",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dark",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dragon",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "electric",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fairy",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fire",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fighting",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "flying",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "grass",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ghost",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ground",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ice",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "normal",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "poison",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "psychic",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "water",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "rock",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "steel",
                        weight = 1f
                    )
                ),
                advantages = listOf(
                    PokemonModel.TypeWeighted(
                        name = "bug",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dark",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dragon",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "electric",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fairy",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fire",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fighting",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "flying",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "grass",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ghost",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ground",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ice",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "normal",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "poison",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "psychic",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "water",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "rock",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "steel",
                        weight = 1f
                    )
                )
            ),
            evolution = listOf(
                PokemonModel.Evolution(
                    before = "bulbasuar",
                    after = "ivysaur",
                    requirementLevel = 16,
                    otherRequirements = listOf()
                ),
                PokemonModel.Evolution(
                    before = "ivysaur",
                    after = "venusaur",
                    requirementLevel = 32,
                    otherRequirements = listOf()
                )
            ), //anothercall
            moves = listOf(
                PokemonModel.Move("growl", 1),
                PokemonModel.Move("tackle", 1),
                PokemonModel.Move("vine-whip", 3),
                PokemonModel.Move("growth", 6),
                PokemonModel.Move("leech-seed", 9),
                PokemonModel.Move("razor-leaf", 12),
                PokemonModel.Move("poison-powder", 15),
                PokemonModel.Move("sleep-powder", 15),
                PokemonModel.Move("seed-bomb", 18),
                PokemonModel.Move("take-down", 21),
                PokemonModel.Move("sweet-scent", 24),
                PokemonModel.Move("synthesis", 27),
                PokemonModel.Move("worry-seed", 30),
                PokemonModel.Move("double-edge", 33),
                PokemonModel.Move("solar-beam", 36)
            )
        )

        Assert.assertTrue(bulbasaur.toPokemonEntryModel() == expected)
    }

    @Test
    fun mantykeToPokemonModel() {
        val expected = PokemonModel(
            id = 1,
            name = "bulbasaur",
            sprite = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png",
            types = listOf("grass", "poison"),
            isFavorite = false,
            about =  PokemonModel.About(
                species = "seed", //another call
                height = 7,
                weight = 69,
                abilities = listOf("overgrow", "chlorophyll"),
                breeding = PokemonModel.Breeding(
                    genderRate = 1, // another call
                    eggGroups = "Monster", //antother call
                    eggCycle = "Grass" //another call
                ),
                baseExperience = 64
            ),
            baseStats = PokemonModel.BaseStats(
                hp = 45,
                attack = 49,
                defense = 49,
                spAtk = 65,
                spDef = 65,
                speed = 45,
                defenses = listOf(
                    PokemonModel.TypeWeighted(
                        name = "bug",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dark",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dragon",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "electric",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fairy",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fire",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fighting",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "flying",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "grass",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ghost",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ground",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ice",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "normal",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "poison",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "psychic",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "water",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "rock",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "steel",
                        weight = 1f
                    )
                ),
                advantages = listOf(
                    PokemonModel.TypeWeighted(
                        name = "bug",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dark",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "dragon",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "electric",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fairy",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fire",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "fighting",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "flying",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "grass",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ghost",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ground",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "ice",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "normal",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "poison",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "psychic",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "water",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "rock",
                        weight = 1f
                    ),
                    PokemonModel.TypeWeighted(
                        name = "steel",
                        weight = 1f
                    )
                )
            ),
            evolution = listOf(
                PokemonModel.Evolution(
                    before = "bulbasuar",
                    after = "ivysaur",
                    requirementLevel = 16,
                    otherRequirements = listOf()
                ),
                PokemonModel.Evolution(
                    before = "ivysaur",
                    after = "venusaur",
                    requirementLevel = 32,
                    otherRequirements = listOf()
                )
            ), //anothercall
            moves = listOf(
                PokemonModel.Move("growl", 1),
                PokemonModel.Move("tackle", 1),
                PokemonModel.Move("vine-whip", 3),
                PokemonModel.Move("growth", 6),
                PokemonModel.Move("leech-seed", 9),
                PokemonModel.Move("razor-leaf", 12),
                PokemonModel.Move("poison-powder", 15),
                PokemonModel.Move("sleep-powder", 15),
                PokemonModel.Move("seed-bomb", 18),
                PokemonModel.Move("take-down", 21),
                PokemonModel.Move("sweet-scent", 24),
                PokemonModel.Move("synthesis", 27),
                PokemonModel.Move("worry-seed", 30),
                PokemonModel.Move("double-edge", 33),
                PokemonModel.Move("solar-beam", 36)
            )
        )

        Assert.assertTrue(mantyke.toPokemonEntryModel() == expected)
    }
}