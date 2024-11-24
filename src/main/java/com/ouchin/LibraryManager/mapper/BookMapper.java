package com.ouchin.LibraryManager.mapper;

import com.ouchin.LibraryManager.dto.respense.BookResponseDTO;
import com.ouchin.LibraryManager.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookResponseDTO toEntity(Book book);

    Book ToResponseDto(BookResponseDTO bookResponseDTO);
}
