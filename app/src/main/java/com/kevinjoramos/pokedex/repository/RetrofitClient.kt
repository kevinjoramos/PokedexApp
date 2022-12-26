package com.kevinjoramos.pokedex.repository

import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Inject
import javax.inject.Named

class RetrofitClient @Inject constructor(
    @Named("base_url") private val BASE_URL: String
) {

    fun getClient(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create())
            .build()

}