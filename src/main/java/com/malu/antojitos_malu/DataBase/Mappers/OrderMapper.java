package com.malu.antojitos_malu.DataBase.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

import com.malu.antojitos_malu.DataBase.Entities.Orden;
import com.malu.antojitos_malu.Domain.DTO.OrderDTO;

@Mapper(componentModel = "spring")
public interface OrderMapper {
  @Mappings({
    @Mapping(target = "id", source = "idOrden"),
    @Mapping(target = "idUser", source = "idUsuario"),
    @Mapping(target = "date", source = "fecha"),
    @Mapping(target = "total", source = "total"),
    @Mapping(target = "status", source = "estatus"),
  })
  OrderDTO toOrderDTO(Orden orden);

  @InheritInverseConfiguration
  Orden toOrden(OrderDTO orderDTO);
}
