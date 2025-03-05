package com.tutorial.kotlin.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import com.ninjasquad.springmockk.MockkBean
import com.tutorial.kotlin.domain.dto.AuthorDto
import com.tutorial.kotlin.domain.entities.AuthorEntity
import com.tutorial.kotlin.services.AuthorService
import com.tutorial.kotlin.testAuthorDtoA
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
class AuthorsControllerTest @Autowired constructor(
    private val mockMvc: MockMvc,
    @MockkBean private val authorService: AuthorService) {

    val objectMapper = ObjectMapper();

    @BeforeEach
    fun setup() {
        every {
            authorService.save(any())
        } answers {
            firstArg()
        }
    }

    @Test
    fun `test that create AuthorService saves correctly`() {
        mockMvc.post("/v1/authors") {
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(
                testAuthorDtoA()
            )
        }

        val expected = AuthorEntity(
            id = null,
            name = "John Doe",
            age = 7,
            image = "author-image.jpg",
            description = "some-description"
        )

        verify { authorService.save(expected) }
    }

    @Test
    fun `test that create Author returns a HTTP 201 status code on successful create`() {
        mockMvc.post("/v1/authors") {
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(
                testAuthorDtoA()
            )
        }.andExpect {
            status { isCreated() }
        }
    }

}