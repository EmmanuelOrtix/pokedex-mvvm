package com.example.pokedex.data.mapper

import com.example.pokedex.data.remote.model.RemoteHomePokedex
import com.example.pokedex.domain.model.DomainHomePokedex

class DataHomePokedexMapper(private val resultMapper: DataHomeResultMapper) {

    fun RemoteHomePokedex.fromRemoteToDomain() = DomainHomePokedex(
        count = count ?: Long.MIN_VALUE,
        next = next.orEmpty(),
        previous = previous.orEmpty(),
        results = results?.map {
            with(resultMapper) { it.fromRemoteToDomain() }
        }.orEmpty()
    )
}