package com.example.app.data.remote.species_auto_gen


import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Shape(
    val name: String?,
    val url: String?
)