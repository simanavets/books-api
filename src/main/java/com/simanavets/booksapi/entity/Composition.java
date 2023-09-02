package com.simanavets.booksapi.entity;

import com.simanavets.booksapi.dto.CompositionReadDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Composition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private Boolean isFinished;
    
    public CompositionReadDto toDto() {
        return CompositionReadDto.builder()
                .name(this.name)
                .build();
    }
    
}
