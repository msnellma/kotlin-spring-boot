package com.tutorial.kotlin.repositories

import com.tutorial.kotlin.domain.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<Author, Long?> {}