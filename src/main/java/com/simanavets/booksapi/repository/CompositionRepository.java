package com.simanavets.booksapi.repository;

import com.simanavets.booksapi.entity.Composition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompositionRepository extends JpaRepository<Composition, Integer> {
}
