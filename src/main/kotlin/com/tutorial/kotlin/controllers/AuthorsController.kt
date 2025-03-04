package com.tutorial.kotlin.controllers

import com.tutorial.kotlin.domain.dto.AuthorDto
import com.tutorial.kotlin.services.AuthorService
import com.tutorial.kotlin.toAuthorDto
import com.tutorial.kotlin.toAuthorEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping(path=["/v1/authors"])
    fun createAuthor(@RequestBody author: AuthorDto): ResponseEntity<AuthorDto> {
        val createdAuthor = authorService.save(author.toAuthorEntity()).toAuthorDto()
        return ResponseEntity(createdAuthor, HttpStatus.CREATED)
    }
}