package com.simanavets.booksapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CompositionCreateUpdateDto {
    @NotBlank
    private String name;
    @NotBlank
    private String author;
    @NotNull
    private Boolean isFinished;
}
