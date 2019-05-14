package com.samson.demobooks.controllers;

import com.samson.demobooks.models.Book;
import com.samson.demobooks.models.Category;
import com.samson.demobooks.models.repo.BookRepo;
import com.samson.demobooks.models.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @RequestMapping("/")
    public String getIndex(ModelMap modelMap){

        List<Book> bookList = bookRepo.getAllBooks();

        modelMap.put("books", bookList);

        return "index";
    }

    @RequestMapping("/book/{nameImg}")
    public String getDetails(@PathVariable String nameImg, ModelMap modelMap){

        Book book = bookRepo.getBookNameImg(nameImg);
        Category category = categoryRepo.getCategoryById(book);

        modelMap.put("book", book);
        modelMap.put("category", category);

        return "bookDetails";
    }
}
