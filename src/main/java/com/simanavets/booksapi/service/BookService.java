package com.simanavets.booksapi.service;

import com.simanavets.booksapi.dto.BookReadDto;
import com.simanavets.booksapi.model.Book;
import com.simanavets.booksapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

import static java.util.stream.Collectors.toList;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<BookReadDto> findAll() {
        return repository.findAll()
                .stream().map(Book::toDto)
                .collect(toList());
    }

    public Book findOneById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(String.format("No book with id = %s", id)));
    }

    public Book save(Book book) {
        return repository.save(book);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
