package com.ouchin.LibraryManager.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryRequestDTO {
    @NotBlank
    @Column(unique = true, nullable = false)
    private String name;

}
