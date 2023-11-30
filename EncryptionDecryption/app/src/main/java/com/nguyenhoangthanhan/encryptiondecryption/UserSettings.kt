package com.nguyenhoangthanhan.encryptiondecryption

import kotlinx.serialization.Serializable

@Serializable
data class UserSettings(
    val username: String? = null,
    val password: String? = null
)