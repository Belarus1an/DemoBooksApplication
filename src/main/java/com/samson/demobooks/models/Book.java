package com.samson.demobooks.models;

public class Book {

    private int categoriesId;
    private String name;
    private String author;
    private int year;
    private int pages;

    public Book(int categoriesId, String name, String author, int year, int pages) {
        this.categoriesId = categoriesId;
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public int getCategoriesId() {
        return categoriesId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }
}
