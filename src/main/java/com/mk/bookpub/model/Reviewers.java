package com.mk.bookpub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Reviewers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;

    protected Reviewers(){}

    public Reviewers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
