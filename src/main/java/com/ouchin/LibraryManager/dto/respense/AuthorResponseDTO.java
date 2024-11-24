package com.ouchin.LibraryManager.dto.respense;

import lombok.Data;

import java.util.List;

@Data
public class AuthorResponseDTO {
    private Long id;
    private String name;
    List<BookResponseDTO> books;
}
