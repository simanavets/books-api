package com.simanavets.booksapi.service;

import com.simanavets.booksapi.dto.AuthorReadDto;
import com.simanavets.booksapi.dto.CompositionReadDto;
import com.simanavets.booksapi.model.Author;
import com.simanavets.booksapi.model.Composition;
import com.simanavets.booksapi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<AuthorReadDto> findAll() {
        return repository.findAll().stream()
                .map(Author::toDto)
                .collect(toList());
    }

    public AuthorReadDto findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(String.format("No author with id = %s", id)))
                .toDto();
    }

    public Set<CompositionReadDto> findAllCompositionsById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(String.format("No author with id = %s", id)))
                .getCompositions().stream()
                .map(Composition::toDto)
                .collect(toSet());
    }

    public AuthorReadDto save(Author author) {
        return repository.save(author).toDto();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
