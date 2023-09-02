package com.simanavets.booksapi.entity;

import com.simanavets.booksapi.dto.AuthorReadDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String firstName;
    private String lastName;
    
    @OneToMany(mappedBy = "author")
    private Set<Composition> compositions;
    
    public AuthorReadDto toDto() {
        return AuthorReadDto.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .build();
    }
}
