package com.simanavets.booksapi.service;

import com.simanavets.booksapi.entity.Book;
import com.simanavets.booksapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> findAll() {
        return repository.findAll();
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
