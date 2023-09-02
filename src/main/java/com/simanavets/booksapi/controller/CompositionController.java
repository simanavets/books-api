package com.simanavets.booksapi.controller;

import com.simanavets.booksapi.entity.Composition;
import com.simanavets.booksapi.service.CompositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compositions")
public class CompositionController {
    
    private final CompositionService service;

    public CompositionController(CompositionService service) {
        this.service = service;
    }
    
    @GetMapping
    public List<Composition> findAll() {
        return service.findAll();
    }
}
