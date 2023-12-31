package com.simanavets.booksapi.repository;

import com.simanavets.booksapi.model.Composition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositionRepository extends JpaRepository<Composition, Integer> {
}
