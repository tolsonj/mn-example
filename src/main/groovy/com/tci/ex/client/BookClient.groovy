package com.tci.ex.api

import com.tci.ex.api.BookApi
import io.micronaut.http.client.Client
import io.micronaut.http.client.annotation.Client

@Client("/")
interface BookClient extends BookApi {}
