package com.simanavets.booksapi.controller;

import com.simanavets.booksapi.dto.AuthorReadDto;
import com.simanavets.booksapi.dto.CompositionReadDto;
import com.simanavets.booksapi.entity.Author;
import com.simanavets.booksapi.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping
    public List<AuthorReadDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public AuthorReadDto getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/{id}/compositions")
    public Set<CompositionReadDto> findAllCompositionsById(@PathVariable Integer id) {
        return service.findAllCompositionsById(id);
    }
    
    @PostMapping
    public AuthorReadDto save(Author author) {
        return service.save(author);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
