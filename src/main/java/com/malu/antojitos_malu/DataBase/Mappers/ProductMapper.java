package com.malu.antojitos_malu.DataBase.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

import com.malu.antojitos_malu.Domain.DTO.ProductDTO;
import com.malu.antojitos_malu.DataBase.Entities.Producto;

@Mapper(componentModel = "spring")
public interface ProductMapper {
  @Mappings({
    @Mapping(target = "id", source = "idProducto"),
    @Mapping(target = "name", source = "nombre"),
    @Mapping(target = "category", source = "categoria"),
    @Mapping(target = "available", source = "existencias"),
    @Mapping(target = "price", source = "precio"),
  })
  ProductDTO toProductDTO(Producto producto);
  List<ProductDTO> toProductsDTOs(List<Producto> productos);

  @InheritInverseConfiguration
  Producto toProducto(ProductDTO productDTO);
}
