package com.tutorial.kotlin.services.impl

import com.tutorial.kotlin.domain.entities.AuthorEntity
import com.tutorial.kotlin.repositories.AuthorRepository
import com.tutorial.kotlin.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository): AuthorService {
    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }
}