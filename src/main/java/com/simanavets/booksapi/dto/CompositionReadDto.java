package com.simanavets.booksapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CompositionReadDto {

    private String name;
    private String author;
    private Boolean isFinished;
}
