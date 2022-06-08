package com.codecool.pa;

public class Book extends Borrowable {
    private int pages;
    private BookType type;

    public Book(String name, int pages, BookType type) {
        super(name);
        this.pages = pages;
        this.type = type;
    }

    public Book(String name) {
        super(name);
    }
}
