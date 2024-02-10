package com.example.app.data.repository.impl

import com.example.app.data.remote.Api
import com.example.app.data.repository.SpeciesRepository
import com.example.app.data.repository.dto.SpeciesResultDto
import javax.inject.Inject

class SpeciesRepositoryImpl @Inject constructor(
    private val api: Api
): SpeciesRepository {
    override suspend fun searchSpecies(idOrName: String): SpeciesResultDto {
        // 必要によりキャッシュ等の処理を追加する

        val speciesResultData = api.species(idOrName)
        val speciesResultDto = SpeciesResultDto(
            baseHappiness = speciesResultData.baseHappiness,
        )
        return speciesResultDto
    }
}