package com.simanavets.booksapi.controller;

import com.simanavets.booksapi.dto.BookReadDto;
import com.simanavets.booksapi.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }
    
    @GetMapping
    public List<BookReadDto> findAll() {
        return service.findAll();
    }
}
