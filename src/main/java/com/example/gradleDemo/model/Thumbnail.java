package com.example.gradleDemo.model;

import javax.persistence.*;

@Entity
public class Thumbnail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String url;
    private String title;
    @ManyToOne
    @JoinColumn(name="book_id", nullable = false)
    private Book book;

    public Thumbnail() {

    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
