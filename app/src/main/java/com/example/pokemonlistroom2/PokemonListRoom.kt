package com.example.pokemonlistroom2

import android.app.Application
import com.example.pokemonlistroom.core.Config
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class PokemonListRoom : Application() {
    override fun onCreate() {
        super.onCreate()
        Config.url = "https://pokeapi.co/api/v2/"
    }
}