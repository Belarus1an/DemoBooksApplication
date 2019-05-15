package com.samson.demobooks.models.repo;

import com.samson.demobooks.models.Book;
import com.samson.demobooks.models.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepo {

    private static List<Book> ALL_BOOKS = Arrays.asList(
            new Book(1, "chipollino","Chipollino","Gianni Rodari", 2007, 180),
            new Book(2, "java","Head Firs Java","Kathy Sierra, Bert Bates", 2003, 720),
            new Book(2, "algorithms","Grokking Algorithms","Y. Bhargava", 2016, 390),
            new Book(1, "harrypotter","Harry Potter","J. K. Rowling", 2007, 520),
            new Book(2, "android","Beginning Android","Mark L. Murphy", 2014, 320),
            new Book(3, "historybelarus","History of Belarus","Lubov Bazan", 20012, 378)
    );

    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }

    public Book getBookNameImg(String nameImg) {

        for (Book value: ALL_BOOKS){
            if (nameImg.equals(value.getNameImg()))
                return value;
        }
        return null;
    }

    public List<Book> getBooksByCategory(int idCategory) {

        List<Book> bookList = new ArrayList<>();

        for (Book value: ALL_BOOKS){
            if (idCategory == value.getCategoriesId()){
                bookList.add(value);
            }
        }
        return bookList;
    }

    public Book getBookByName(String name) {

        for (Book value: ALL_BOOKS){
            if (name.equals(value.getNameBook())){
                return value;
            }
        }
        return null;
    }
}
