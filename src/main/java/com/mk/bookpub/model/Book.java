package com.mk.bookpub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String isbn;
    private String title;
    private String description;

    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;
    @ManyToMany
    private List<Reviewers> reviewersList;

    public Book() {
    }

    public Book(String isbn, String title, String description, Author author, Publisher publisher) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
    }

}
