package com.simanavets.booksapi.model;

import com.simanavets.booksapi.dto.BookReadDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "book_id")
    private List<Composition> compositions;

    private String yearOfProduction;

    private Double price;

    private String description;

    private String location;
    
}
