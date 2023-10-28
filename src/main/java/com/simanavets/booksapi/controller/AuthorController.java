package com.simanavets.booksapi.controller;

import com.simanavets.booksapi.dto.AuthorCreateUpdateDto;
import com.simanavets.booksapi.dto.AuthorReadDto;
import com.simanavets.booksapi.dto.CompositionReadDto;
import com.simanavets.booksapi.service.AuthorService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/authors")
@Validated
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
    public AuthorReadDto getById(
            @Positive(message = "Id should be more than 1")
            @PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/{id}/compositions")
    public Set<CompositionReadDto> findAllCompositionsById(
            @Positive(message = "Id should be more than 1")
            @PathVariable Integer id) {
        return service.findAllCompositionsById(id);
    }

    @PostMapping
    public AuthorReadDto save(@RequestBody @Valid AuthorCreateUpdateDto authorDto) {
        return service.save(authorDto);
    }
    
    @PutMapping("/{id}")
    public AuthorReadDto update(
            @Positive(message = "Id should be more than 1")
            @PathVariable Integer id,
            @RequestBody @Valid AuthorCreateUpdateDto authorDto) {
        return service.update(id, authorDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(
            @Positive(message = "Id should be more than 1")
            @PathVariable Integer id) {
        service.deleteById(id);
    }
}
