package com.tutorial.kotlin.domain.dto

data class AuthorDto (
    var id: Long?,
    val name: String,
    val age: Int,
    val description: String,
    val image: String
)
