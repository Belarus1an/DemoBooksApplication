package com.samson.demobooks.models;

public class Book {

    private int categoriesId;
    private String nameImg;
    private String nameBook;
    private String author;
    private int year;
    private int pages;

    public Book(int categoriesId, String nameImg, String nameBook, String author, int year, int pages) {
        this.categoriesId = categoriesId;
        this.nameImg = nameImg;
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public int getCategoriesId() {
        return categoriesId;
    }

    public String getNameImg() {
        return nameImg;
    }

    public String getNameBook() {
        return nameBook;
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
