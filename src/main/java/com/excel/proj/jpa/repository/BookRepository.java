package com.excel.proj.jpa.repository;

import com.excel.proj.jpa.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface BookRepository extends CrudRepository<BookEntity,Integer> {
}
