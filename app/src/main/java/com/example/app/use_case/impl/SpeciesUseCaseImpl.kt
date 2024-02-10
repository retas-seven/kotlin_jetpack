package com.example.app.use_case.impl

import com.example.app.data.repository.SpeciesRepository
import com.example.app.data.repository.dto.SpeciesResultDto
import com.example.app.use_case.SpeciesUseCase
import javax.inject.Inject

class SpeciesUseCaseImpl @Inject constructor(
    private val speciesRepository: SpeciesRepository
): SpeciesUseCase {
    override suspend fun searchSpecies(idOrName: String): SpeciesResultDto {
        val ret = speciesRepository.searchSpecies(idOrName)
        return ret
    }
}