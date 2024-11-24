package com.ouchin.LibraryManager.dto.respense;

import lombok.Data;

import java.util.List;

@Data
public class CategoryResponseDTO {
    private Long id;
    private String name;
    private List<BookResponseDTO> books;
}
