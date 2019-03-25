package com.tci.ex.domain

import java.util.Objects;
import grails.gorm.annotation.Entity

@Entity
public class Book {
     String isbn;
     String name;

    static constraints = {
      name nullable: true
  }
}
