package com.example.pokedex.data.remote.model

import com.google.gson.annotations.SerializedName

data class RemoteHomePokedex(
    @SerializedName("count") val count: Long?,
    @SerializedName("next") val next: String?,
    @SerializedName("previous") val previous: String?,
    @SerializedName("results") val results: List<RemoteHomeResult>?
)

