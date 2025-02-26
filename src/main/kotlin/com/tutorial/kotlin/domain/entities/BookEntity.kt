package com.tutorial.kotlin.domain.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.JoinColumn
import jakarta.persistence.CascadeType

@Entity
@Table(name="books")
data class BookEntity (
    @Id
    var isbn: String,
    val title: String,
    val description: String,
    val image: String,
    @ManyToOne(cascade = [CascadeType.DETACH])
    @JoinColumn(name="author_id")
    val author: AuthorEntity
)