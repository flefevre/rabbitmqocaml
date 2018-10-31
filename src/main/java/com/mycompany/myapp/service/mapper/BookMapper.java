package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Book and its DTO BookDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BookMapper extends EntityMapper<BookDTO, Book> {


}
