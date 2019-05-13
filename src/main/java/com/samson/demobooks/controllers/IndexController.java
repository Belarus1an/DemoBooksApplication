package com.samson.demobooks.controllers;

import com.samson.demobooks.models.Book;
import com.samson.demobooks.models.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BookRepo bookRepo;

    @RequestMapping("/")
    public String getIndex(ModelMap modelMap){

        List<Book> bookList = bookRepo.getAllBooks();

        modelMap.put("books", bookList);

        return "index";
    }
}
