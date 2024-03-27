package com.malu.antojitos_malu.DataBase.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

import com.malu.antojitos_malu.Domain.DTO.PayMethodDTO;
import com.malu.antojitos_malu.DataBase.Entities.MetodoPago;

@Mapper(componentModel = "spring")
public interface PayMethodMapper {
  @Mappings({
    @Mapping(target = "id", source = "idMetodoPago"),
    @Mapping(target = "idUser", source = "idUsuario"),
    @Mapping(target = "type", source = "tipo"),
    @Mapping(target = "number", source = "numero"),
    @Mapping(target = "expirationDate", source = "fechaExpiracion"),
    @Mapping(target = "cvv", source = "cvv"),
  })
  PayMethodDTO toPayMethodDTO(MetodoPago metodoPago);

  @InheritInverseConfiguration
  MetodoPago toMetodoPago(PayMethodDTO payMethodDTO);
}
