package com.malu.antojitos_malu.DataBase.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.InheritInverseConfiguration;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesProducto;
import com.malu.antojitos_malu.Domain.DTO.ProductImgDTO;

@Mapper(componentModel = "spring")
public interface ProductImgMapper {
  @Mappings({
    @Mapping(target = "id", source = "idImagenProducto"),
    @Mapping(target = "idProduct", source = "idProducto"),
    @Mapping(target = "url", source = "url"),
  })
  ProductImgDTO toProductImgDTO(ImagenesProducto imagenesProducto);

  @InheritInverseConfiguration
  ImagenesProducto toImagenesProducto(ProductImgDTO productImgDTO);
}
