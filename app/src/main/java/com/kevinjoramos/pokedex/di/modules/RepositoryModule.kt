package com.kevinjoramos.pokedex.di.modules

import com.kevinjoramos.pokedex.domain.repository.PokemonDataRepository
import com.kevinjoramos.pokedex.data.repository.PokedexRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindPokedexRepository(
        pokedexRepositoryImpl: PokedexRepositoryImpl
    ): PokemonDataRepository
}