package com.example.app.data.remote.species_auto_gen


import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EggGroup(
    val name: String?,
    val url: String?
)