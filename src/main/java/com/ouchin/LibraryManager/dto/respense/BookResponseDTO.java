package com.ouchin.LibraryManager.dto.respense;

import lombok.Data;

import java.util.List;

@Data
public class BookResponseDTO {

    private Long id;
    private String name;
    private int numPage;
    private List<CategoryResponseDTO> books;
    private List<AuthorResponseDTO> author;

}
