package com.tutorial.kotlin

import com.tutorial.kotlin.domain.AuthorEntity
import com.tutorial.kotlin.domain.dto.AuthorDto

fun AuthorEntity.toAuthorDto() = AuthorDto(
        id=this.id,
        name=this.name,
        age=this.age,
        description=this.description,
        image=this.image
    )

fun AuthorDto.toAuthorEntity() = AuthorEntity(
        id=this.id,
        name=this.name,
        age=this.age,
        description=this.description,
        image=this.image
    )