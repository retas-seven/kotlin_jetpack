package com.example.app.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.use_case.SpeciesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor (
    private val speciesUseCase: SpeciesUseCase
): ViewModel() {
    init {
        println(">>>HomeScreenViewModel init")
    }

    fun searchSpecies(idOrName: String) {
        viewModelScope.launch {
            val species = speciesUseCase.searchSpecies("1")
            println(">>>species: $species")
        }
    }
}