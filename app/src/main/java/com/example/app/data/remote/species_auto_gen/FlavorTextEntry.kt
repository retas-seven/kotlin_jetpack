package com.example.app.data.remote.species_auto_gen


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FlavorTextEntry(
    @Json(name = "flavor_text")
    val flavorText: String?,
    val language: Language?,
    val version: Version?
)