package com.kevinjoramos.pokedex

import com.fasterxml.jackson.databind.ObjectMapper
import com.kevinjoramos.pokedex.domain.mappers.toPokemonEntryModel
import com.kevinjoramos.pokedex.domain.model.external.Pokemon
import com.kevinjoramos.pokedex.domain.model.internal.PokemonEntryModel
import org.junit.Test
import java.io.File

class MappersTest {

    private val pokemonModel: Pokemon

    init {
        val mapper: ObjectMapper = ObjectMapper()
        pokemonModel = mapper.readValue(File("resources/pokemon_bulbasaur.json"), Pokemon::class.java)
    }

    @Test
    fun pokemonToPokemonEntryModelMapperSuccess() {
        val expected = PokemonEntryModel(
            id = 1,
            name = "bulbasaur",
            sprite = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
            types = listOf("grass", "poison"),
            isFavorite = false,
            about =  PokemonEntryModel.About(
                species = "seed", //another call
                height = 7,
                weight = 69,
                abilities = listOf("overgrow", "chlorophyll"),
                breeding = PokemonEntryModel.Breeding(
                    genderRate = 1, // another call
                    eggGroups = "Monster", //antother call
                    eggCycle = "Grass" //another call
                )
            ),
            baseStats = PokemonEntryModel.BaseStats(
                hp = 45,
                attack = 49,
                defense = 49,
                spAtk = 65,
                spDef = 65,
                speed = 45,
                typeDefenses = listOf()
            ),
            evolution = listOf<PokemonEntryModel.Evolution>(), //anothercall
            moves = listOf(
                PokemonEntryModel.Move("razor-wind", 0),
                PokemonEntryModel.Move("swords-dance", 0),
                PokemonEntryModel.Move("cut", 0),
                PokemonEntryModel.Move("bind", 0),
                PokemonEntryModel.Move("vine-whip", 0),
                PokemonEntryModel.Move("headbutt", 0),
                PokemonEntryModel.Move("tackle", 0),
                PokemonEntryModel.Move("body-slam", 0),
                PokemonEntryModel.Move("take-down", 0),
                PokemonEntryModel.Move("double-edge", 0),
                PokemonEntryModel.Move("growl", 0),
                PokemonEntryModel.Move("strength", 0),
                PokemonEntryModel.Move("mega-drain", 0),
                PokemonEntryModel.Move("leech-seed", 0),
                PokemonEntryModel.Move("growth", 0),
                PokemonEntryModel.Move("razor-leaf", 0),
                PokemonEntryModel.Move("solar-beam", 0),
                PokemonEntryModel.Move("poison-powder", 0),
                PokemonEntryModel.Move("sleep-powder", 0),
                PokemonEntryModel.Move("petal-dance", 0),
            )
        )

        val pokemonEntryModel = pokemonModel.toPokemonEntryModel()
    }
}