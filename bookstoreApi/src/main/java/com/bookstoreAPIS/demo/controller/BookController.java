package com.bookstoreAPIS.demo.controller;

import com.bookstoreAPIS.demo.model.Book;
import com.bookstoreAPIS.demo.model.Category;
import com.bookstoreAPIS.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    // create, update, delete, getbyid, getall = CRUD.repo
    @Autowired
    BookService bookService;


    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping("/category")
    public List<Category> getAllCategory() {
        return bookService.getAllCategory();
    }

    @RequestMapping("/books/{id}")
    public Book getABookById(@RequestBody Long id){
        return bookService.getABookById(id);
    }


    @RequestMapping("/books/{id}")
    public Category getACategoryById(@RequestBody Long id){
        return bookService.getCategoryById(id);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBookById(@PathVariable Book id){
    bookService.deleteBookById(id);
    }

    @DeleteMapping("/category/{id}")
    public void deleteCategoryById(@PathVariable Category id){
        bookService.deleteCategoryById(id);
    }

    @PostMapping("/book")
    public void addBook(@PathVariable Book book){
        bookService.addBook(book) ;
    }

    @PutMapping("/book/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book book){
        bookService.updateBook(id, book);
    }

}
