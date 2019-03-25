package com.tci.ex.service

import grails.gorm.services.Service

import com.tci.ex.domain.Book
import io.micronaut.http.annotation.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.inject.Singleton





@Service(Book)
interface  BookService {
    int count();
    Book save(Book book)
    Book save(String name, String isbn)
    List<Book> findAll()
    Book find( Long id)
    Book delete( Long id)

}
