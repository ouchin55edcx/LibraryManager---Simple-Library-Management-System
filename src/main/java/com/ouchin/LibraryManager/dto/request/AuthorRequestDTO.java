package com.ouchin.LibraryManager.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AuthorRequestDTO {

    @NotBlank
    @Column(unique = true)
    private String name;




}
