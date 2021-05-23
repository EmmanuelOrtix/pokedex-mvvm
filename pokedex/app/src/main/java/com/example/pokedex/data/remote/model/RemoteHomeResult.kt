package com.example.pokedex.data.remote.model

import com.google.gson.annotations.SerializedName

data class RemoteHomeResult(
    @SerializedName("name") val name:String?,
    @SerializedName("url") val url: String?
)