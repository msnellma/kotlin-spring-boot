package com.tutorial.kotlin.controllers

import com.tutorial.kotlin.domain.dto.AuthorDto

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class AuthorsController {

    @PostMapping(path=["/v1/authors"])
    fun createAuthor(@RequestBody author: AuthorDto): AuthorDto {

    }
}