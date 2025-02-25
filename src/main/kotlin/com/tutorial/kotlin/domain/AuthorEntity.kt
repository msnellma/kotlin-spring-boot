package com.tutorial.kotlin.domain

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
@Table(name="authors")
data class AuthorEntity (
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="author_id_seq")
    var id: Long?,
    val name: String,
    val age: Int,
    val description: String,
    val image: String
)
