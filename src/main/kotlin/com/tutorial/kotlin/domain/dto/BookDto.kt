package com.tutorial.kotlin.domain.dto

data class BookEntity (
    var isbn: String,
    val title: String,
    val description: String,
    val image: String,
    val author: AuthorDto
)