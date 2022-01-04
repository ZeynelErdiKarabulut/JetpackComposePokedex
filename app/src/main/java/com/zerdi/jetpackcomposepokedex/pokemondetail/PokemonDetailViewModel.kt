package com.zerdi.jetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.zerdi.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.zerdi.jetpackcomposepokedex.repository.PokemonRepository
import com.zerdi.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}