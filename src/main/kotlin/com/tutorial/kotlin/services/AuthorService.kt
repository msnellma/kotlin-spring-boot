package com.tutorial.kotlin.services

import com.tutorial.kotlin.domain.AuthorEntity

interface AuthorService {
    fun save(authorEntity: AuthorEntity): AuthorEntity
}