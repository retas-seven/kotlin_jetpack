package com.example.app.data.repository.impl

import com.example.app.data.remote.Api
import com.example.app.data.repository.SpeciesRepository
import com.example.app.data.repository.dto.SpeciesResultDto
import kotlinx.coroutines.delay
import javax.inject.Inject

class SpeciesRepositoryImpl @Inject constructor(
    private val api: Api
): SpeciesRepository {
    override suspend fun searchSpecies(idOrName: String): SpeciesResultDto {
        // 必要によりキャッシュ等の処理を追加する

        // APIを使用してデータ取得
        val speciesResultData = api.species(idOrName)

        // 取得したデータをDtoに変換
        val speciesResultDto = SpeciesResultDto(
            baseHappiness = speciesResultData.baseHappiness ?: 0,
            id = speciesResultData.id ?: 0,
            name = speciesResultData.name ?: "none",
        )

        return speciesResultDto
    }
}