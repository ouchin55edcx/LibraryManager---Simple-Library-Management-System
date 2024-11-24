package com.ouchin.LibraryManager.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BookRequestDTO {

    @NotBlank(message = "the title it is required ")
    @Size(min = 5, max = 30)
    private String title;

    @NotBlank
    @Positive
    private int numPage;

    @NotNull
    private Long categoryId;

    @NotNull
    private Long authorId;

}
