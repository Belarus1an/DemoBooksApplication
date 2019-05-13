package com.samson.demobooks.models.repo;

import com.samson.demobooks.models.Book;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepo {

    private static List<Book> ALL_BOOKS = Arrays.asList(
            new Book(1, "java", "Kathy Sierra, Bert Bates", 2003, 720),
            new Book(1, "algorithms", "Y. Bhargava", 2016, 390),
            new Book(1, "harrypotter", "J. K. Rowling", 2007, 520)
    );

    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }
}
