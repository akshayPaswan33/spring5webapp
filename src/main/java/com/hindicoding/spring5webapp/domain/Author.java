package com.hindicoding.spring5webapp.domain;

import java.util.Set;

/***
 * Created by Akshay on 18/9/20
 */
public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    //JPA require a 0 args constructor
    public Author() {
    }

    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
