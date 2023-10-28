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

    private Integer yearOfProduction;

    private Double price;

    private String description;

    private String location;

    public BookReadDto toDto() {
        return BookReadDto.builder()
                .compositions(this.compositions.stream()
                        .map(Composition::toDto)
                        .collect(toList()))
                .yearOfProduction(this.yearOfProduction)
                .price(this.price)
                .description(this.description)
                .location(this.location)
                .build();
    }
}
