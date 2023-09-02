package com.simanavets.booksapi.service;

import com.simanavets.booksapi.dto.AuthorReadDto;
import com.simanavets.booksapi.dto.CompositionReadDto;
import com.simanavets.booksapi.entity.Author;
import com.simanavets.booksapi.entity.Composition;
import com.simanavets.booksapi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<AuthorReadDto> findAll() {
        return repository.findAll()
                .stream()
                .map(Author::toDto)
                .collect(Collectors.toList());
    }

    public AuthorReadDto findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(String.format("No author with id = %s", id)))
                .toDto();
    }
    
    public Set<CompositionReadDto> findAllCompositionsById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(String.format("No author with id = %s", id)))
                .getCompositions()
                .stream()
                .map(Composition::toDto)
                .collect(Collectors.toSet());
    }
    
    public AuthorReadDto save(Author author) {
        return repository.save(author).toDto();
    }
    
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
