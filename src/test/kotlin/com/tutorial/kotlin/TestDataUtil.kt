package com.tutorial.kotlin

import com.tutorial.kotlin.domain.dto.AuthorDto
import com.tutorial.kotlin.domain.entities.AuthorEntity

fun testAuthorDtoA(id: Long? = null) = AuthorDto(
    id = id,
    name = "John Doe",
    age = 7,
    image = "author-image.jpg",
    description = "some-description"
)

fun testAuthorEntityA(id: Long? = null) = AuthorEntity(
    id = id,
    name = "John Doe",
    age = 7,
    image = "author-image.jpg",
    description = "some-description"
)