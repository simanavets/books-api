package com.simanavets.booksapi.service;

import com.simanavets.booksapi.entity.Author;
import com.simanavets.booksapi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> findAll() {
        return repository.findAll();
    }
    
    public Author getById(Integer id) {
        return repository.getReferenceById(id);
    }

}
