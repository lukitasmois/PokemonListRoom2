package com.example.pokemonlistroom.data.network

import com.example.pokemonlistroom2.data.model.PokemonModel
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiClient {

    @GET("pokemon/")
    fun getUrlPokemons() : Response<List<PokemonModel>>

}