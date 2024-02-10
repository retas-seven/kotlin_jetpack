package com.example.app.data.remote.species_auto_gen


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokedexNumber(
    @Json(name = "entry_number")
    val entryNumber: Int?,
    val pokedex: Pokedex?
)