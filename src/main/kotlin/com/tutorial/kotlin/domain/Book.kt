package com.tutorial.kotlin.domain

import jakarta.persistence.Entity

@Entity
data class Book (
    var isbn: String,
    val title: String,
    val description: String,
    val image: String,
    val author: String
)