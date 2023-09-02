package com.simanavets.booksapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
