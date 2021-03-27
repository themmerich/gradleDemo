package com.example.gradleDemo.controller;

import com.example.gradleDemo.model.Book;
import com.example.gradleDemo.repository.BookRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    private final BookRepository repository;

    BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/books")
    public List<Book> getAll() {
        return (List<Book>) repository.findAll();
    }

    @GetMapping("/book/{isbn}")
    public Book findByIsbn(@PathVariable String isbn) {
        return repository.findByIsbn(isbn);
    }
}
