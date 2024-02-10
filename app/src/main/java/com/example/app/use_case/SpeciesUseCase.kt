package com.example.app.use_case

import com.example.app.data.repository.dto.SpeciesResultDto

interface SpeciesUseCase {
    suspend fun searchSpecies(idOrName: String): SpeciesResultDto
}