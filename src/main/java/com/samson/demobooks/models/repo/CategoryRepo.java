package com.samson.demobooks.models.repo;

import com.samson.demobooks.models.Book;
import com.samson.demobooks.models.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


@Repository
public class CategoryRepo {

    private static List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "dladzieci"),
            new Category(2, "programowanie"),
            new Category(3, "historia")
    );

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category getCategoryById(Book book){

        for (Category value: ALL_CATEGORIES){
            if (book.getCategoriesId() == value.getCategoryId()){
                return value;
            }
        }
        return null;
    }
}
