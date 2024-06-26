package com.example.pokemonlistroom2.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pokemonlistroom2.data.database.entities.PokemonEntity


@Dao
interface PokemonDao {

    @Query("SELECT * FROM pokemon_table ORDER BY name DESC")
    suspend fun getAllPokemons(): List<PokemonEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(pokemons:List<PokemonEntity>)

    @Query("DELETE FROM pokemon_table")
    suspend fun deleteAllPokemons()

}