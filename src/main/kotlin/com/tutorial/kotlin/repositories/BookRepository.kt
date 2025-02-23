package com.tutorial.kotlin.repositories

import com.tutorial.kotlin.domain.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, String> {}