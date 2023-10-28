package com.simanavets.booksapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AuthorReadDto {
    private Integer id;
    private String firstName;
    private String lastName;
}
