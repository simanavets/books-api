package com.simanavets.booksapi.service;

import com.simanavets.booksapi.dto.CompositionReadDto;
import com.simanavets.booksapi.model.Composition;
import com.simanavets.booksapi.repository.CompositionRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CompositionService {

    private final CompositionRepository repository;

    public CompositionService(CompositionRepository repository) {
        this.repository = repository;
    }

    public Set<CompositionReadDto> findAll() {
        return repository.findAll()
                .stream()
                .map(Composition::toDto)
                .collect(Collectors.toSet());
    }
}
