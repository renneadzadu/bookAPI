package com.bookstoreAPIS.demo.service;

import com.bookstoreAPIS.demo.model.Book;
import com.bookstoreAPIS.demo.model.Category;
import com.bookstoreAPIS.demo.repository.BookRepository;
import com.bookstoreAPIS.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

//   public List<Book> books = Arrays.asList(
//           new Book(1L,"Law of Human Nature", "Robert Greene","This book talks about human personality"),
//           new Book(2L,"Art of seduction", "Robert Greene","This book examines social power through the lens of seduction"),
//           new Book(3L,"Head First Java","Kathy Sierra","Learning a complex new language is no easy task especially when it s an object-oriented computer programming language like Java")
//           );


   public List<Book> getAllBooks(){
       List<Book> books = new ArrayList<>();
       bookRepository.findAll().forEach(books :: add);
       return books;
   }
   public void addBook(Book books){
       bookRepository.save(books);
   }

    public Book getABookById(Long id){
        return bookRepository.findById(id).get();
    }

    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).get();
    }

    public void deleteBookById(Book id){
       bookRepository.delete(id);
    }

    public void deleteCategoryById(Category id) {
       categoryRepository.delete(id);
    }


    public List<Category> getAllCategory() {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories:: add);
        return categories;
    }

    public void updateBook(Long id, Book book){
       bookRepository.save(book);
    }
}
