package com.tutorial.kotlin.services

import com.tutorial.kotlin.domain.entities.AuthorEntity

interface AuthorService {
    fun save(authorEntity: AuthorEntity): AuthorEntity
}