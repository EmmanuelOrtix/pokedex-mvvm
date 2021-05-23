package com.example.pokedex.data.mapper

import com.example.pokedex.data.remote.model.RemoteHomeResult
import com.example.pokedex.domain.model.DomainHomeResult

class DataHomeResultMapper {

    fun RemoteHomeResult.fromRemoteToDomain() = DomainHomeResult(
        name = name.orEmpty(),
        url = url.orEmpty()
    )
}