package com.zerdi.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Result(
    val name: String,
    val url: String
)