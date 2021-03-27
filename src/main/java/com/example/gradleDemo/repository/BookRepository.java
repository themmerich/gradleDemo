package com.example.gradleDemo.repository;

import com.example.gradleDemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    Book findById(long id);
    Book findByIsbn(String isbn);
}
