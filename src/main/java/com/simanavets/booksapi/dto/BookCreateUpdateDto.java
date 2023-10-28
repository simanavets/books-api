package com.simanavets.booksapi.dto;

import com.simanavets.booksapi.validation.NotLater;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class BookCreateUpdateDto {
    @NotEmpty(message = "Collections should not be empty")
    private List<CompositionReadDto> compositions;

    @Min(value = 1800, message = "Year should be more than 1800")
    @NotLater
    private Integer yearOfProduction;

    @Positive(message = "Price should be more than zero")
    private Double price;

    private String description;
    @NotBlank
    private String location;
}
