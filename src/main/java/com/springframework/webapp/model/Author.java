package com.springframework.webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
/**
* @author - vgovind
*/
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lastName;
    private String firstName;
    @ManyToMany
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Author(String lastName, String firstName, Set<Book> books) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
