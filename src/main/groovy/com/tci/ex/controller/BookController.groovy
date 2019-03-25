package com.tci.ex.controller

import com.tci.ex.api.BookApi
import com.tci.ex.domain.Book
import com.tci.ex.service.BookService

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import javax.inject.Inject


import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*


@Controller("/")
class BookController implements BookApi {

    final BookService bookService

    @Inject
    BookController(BookService bookService) {
        this.bookService = bookService
    }

    @Post("/save")
    Book save(Book book) {
        return bookService.save(book)

    }


    @Get("/")
    List<Book> findAll() {
      return bookService.findAll();
   }

    @Get("/{id}")
    Book find(Long id) {
      return bookService.find(id)
   }

    @Delete("/{id}")
    Book delete(Long id) {
      return bookService.delete(id)
   }
}
