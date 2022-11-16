package com.bookstoreAPIS.demo.repository;

import com.bookstoreAPIS.demo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
