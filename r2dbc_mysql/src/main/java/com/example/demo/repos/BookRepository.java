package com.example.demo.repos;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domains.Book;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, Integer> {

}
