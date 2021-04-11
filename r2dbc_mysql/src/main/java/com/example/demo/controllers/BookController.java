package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domains.Book;
import com.example.demo.repos.BookRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class BookController {

	
	@Autowired
	private BookRepository repo;
	
	
    @GetMapping(path="/books",produces =MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<Book> getBooks() {
        return repo.findAll();
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> createBook(@RequestBody Book book) {
        return repo.save(book);
    }

   
    @GetMapping("/books/{id}")
    public Mono<Book> getBook(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @PutMapping("/books")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Book> updateBook(@RequestBody Book Book) {
        return this.repo
                .findById(Book.getId())
                .map(c->Book)
                .flatMap(this.repo::save);
    }

    @DeleteMapping("/books")
    public Mono<Book> delete(Integer id) {
        return this.repo
                .findById(id)
                .flatMap(Book -> this.repo.deleteById(Book.getId()).thenReturn(Book));
    }


	
}
