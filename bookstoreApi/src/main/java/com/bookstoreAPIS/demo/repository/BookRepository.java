package com.bookstoreAPIS.demo.repository;

import com.bookstoreAPIS.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
