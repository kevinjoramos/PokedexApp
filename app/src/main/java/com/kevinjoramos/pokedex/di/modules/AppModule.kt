package com.kevinjoramos.pokedex.di.modules

import com.kevinjoramos.pokedex.data.remote.ApiConstants
import com.kevinjoramos.pokedex.data.remote.PokemonApi
import com.kevinjoramos.pokedex.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(retrofitClient: RetrofitClient): Retrofit {
        return retrofitClient.getClient()
    }

    @Provides
    @Singleton
    fun providePokemonApi(retrofit: Retrofit): PokemonApi {
        return retrofit.create(PokemonApi::class.java)
    }

    @Provides
    @Singleton
    @Named("base_url")
    fun provideBaseUrl(): String {
        return ApiConstants.BASE_URL
    }

}