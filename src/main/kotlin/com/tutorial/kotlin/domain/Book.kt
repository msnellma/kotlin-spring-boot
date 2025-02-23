package com.tutorial.kotlin.domain

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.JoinColumn
import jakarta.persistence.CascadeType

@Entity
@Table(name="books")
data class Book (
    @Id
    var isbn: String,
    val title: String,
    val description: String,
    val image: String,
    @ManyToOne(cascade = [CascadeType.DETACH])
    @JoinColumn(name="author_id")
    val author: Author
)