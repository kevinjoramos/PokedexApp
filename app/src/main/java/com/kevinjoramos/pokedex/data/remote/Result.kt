package com.kevinjoramos.pokedex.data.remote

sealed class NetworkResult<T> {
    class Success<T>(val data: T) : NetworkResult<T>()
    class Error<T>(val code: Int, val message: String?, val exception: Exception?) : NetworkResult<T>()
    class Loading<T>(val message: String) : NetworkResult<T>()
}
