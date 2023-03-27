package com.mk.bookpub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "publisher")
    private List<Book> bookList;

    protected Publisher(){}

    public Publisher(String name) {
        this.name = name;
    }
}
