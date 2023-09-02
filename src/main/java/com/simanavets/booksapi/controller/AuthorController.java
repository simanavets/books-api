package com.simanavets.booksapi.controller;

import com.simanavets.booksapi.dto.AuthorReadDto;
import com.simanavets.booksapi.dto.CompositionReadDto;
import com.simanavets.booksapi.entity.Author;
import com.simanavets.booksapi.entity.Composition;
import com.simanavets.booksapi.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping
    public List<AuthorReadDto> getAll() {
        return service.findAll()
                .stream()
                .map(Author::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AuthorReadDto getById(@PathVariable Integer id) {
        Author author = service.getById(id);
        return author.toDto();
    }

    @GetMapping("/{id}/compositions")
    public Set<CompositionReadDto> getAuthorCompositions(@PathVariable Integer id) {
        Set<Composition> compositions = service.getById(id)
                .getCompositions();
        return compositions
                .stream()
                .map(Composition::toDto)
                .collect(Collectors.toSet());
    }
}
