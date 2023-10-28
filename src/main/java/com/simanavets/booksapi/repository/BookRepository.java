package com.simanavets.booksapi.repository;

import com.simanavets.booksapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
