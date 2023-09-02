package com.simanavets.booksapi.service;

import com.simanavets.booksapi.entity.Composition;
import com.simanavets.booksapi.repository.CompositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompositionService {

    private final CompositionRepository repository;

    public CompositionService(CompositionRepository repository) {
        this.repository = repository;
    }

    public List<Composition> findAll() {
        return repository.findAll();
    }


}
