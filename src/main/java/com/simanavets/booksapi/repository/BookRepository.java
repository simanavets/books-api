package com.simanavets.booksapi.repository;

import com.simanavets.booksapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
