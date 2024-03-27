package com.malu.antojitos_malu.DataBase.Mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesCategoria;
import com.malu.antojitos_malu.Domain.DTO.CategoryImgDTO;

@Mapper(componentModel = "spring")
public interface CategoryImgMapper {
  @Mappings({
    @Mapping(target = "id", source = "idImagenCategoria"),
    @Mapping(target = "idCategory", source = "idCategoria"),
    @Mapping(target = "url", source = "url"),
  })
  CategoryImgDTO toCategoryImgDTO(ImagenesCategoria imagenesCategoria);

  @InheritInverseConfiguration
  ImagenesCategoria toImagenesCategoria(CategoryImgDTO categoryImgDTO);
}
