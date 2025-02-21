package com.tutorial.kotlin.domain

import jakarta.persistence.Entity

@Entity
data class Author (
    var id: Long?,
    val name: String,
    val age: Int,
    val description: String,
    val image: String
)
