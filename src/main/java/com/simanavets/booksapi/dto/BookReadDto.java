package com.simanavets.booksapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class BookReadDto {
    private List<CompositionReadDto> compositions;
    private Integer yearOfProduction;
    private Double price;
    private String description;
    private String location;
}
