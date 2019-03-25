package com.tci.ex.api

import com.tci.ex.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.*

interface BookApi {
	 @Post("/")
	 Book save(Book book)

	 @Get("/")
	 List<Book> findAll()

	 @Get("/{id}")
	 Book find( Long id)

	 @Delete("/{id}")
	 Book delete( Long id)


}
