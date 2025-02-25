package com.tutorial.kotlin.domain.dto

import com.tutorial.kotlin.domain.dto.AuthorDto

data class BookEntity (
    var isbn: String,
    val title: String,
    val description: String,
    val image: String,
    val author: AuthorDto