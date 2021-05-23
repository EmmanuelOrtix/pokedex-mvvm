package com.example.pokedex.domain.model

data class DomainHomePokedex(
    val count: Long,
    val next: String,
    val previous: String,
    val results: List<DomainHomeResult>
)

