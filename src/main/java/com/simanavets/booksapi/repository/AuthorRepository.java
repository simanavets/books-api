package com.simanavets.booksapi.repository;

import com.simanavets.booksapi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
