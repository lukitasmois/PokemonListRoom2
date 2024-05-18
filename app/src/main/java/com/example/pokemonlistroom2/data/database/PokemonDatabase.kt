package com.example.pokemonlistroom2.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pokemonlistroom2.data.database.dao.PokemonDao
import com.example.pokemonlistroom2.data.database.entities.PokemonEntity


//esta clase seria como un "migrate" .net
@Database(entities = [PokemonEntity::class], version = 0)
abstract class PokemonDatabase : RoomDatabase() {

    abstract fun getPokemonDao(): PokemonDao
}