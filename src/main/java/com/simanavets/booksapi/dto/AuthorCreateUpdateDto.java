package com.simanavets.booksapi.dto;

import com.simanavets.booksapi.model.Author;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import static java.util.Collections.emptyList;

@Data
@AllArgsConstructor
@Builder
public class AuthorCreateUpdateDto {
    @NotBlank(message = "First name should not be empty")
    private String firstName;
    @NotBlank(message = "Last name should not be empty")
    private String lastName;

    public Author fromDto() {
        return Author.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .compositions(emptyList())
                .build();
    }
}
