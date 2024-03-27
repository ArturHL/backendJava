package com.malu.antojitos_malu.DataBase.Mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import com.malu.antojitos_malu.DataBase.Entities.Direccion;
import com.malu.antojitos_malu.Domain.DTO.AddressDTO;

@Mapper(componentModel = "spring")
public interface AddressMapper {
  @Mappings({
    @Mapping(target = "id", source = "idDireccion"),
    @Mapping(target = "idUser", source = "idUsuario"),
    @Mapping(target = "street", source = "calle"),
    @Mapping(target = "number", source = "numero"),
    @Mapping(target = "postalCode", source = "codigoPostal"),
    @Mapping(target = "city", source = "ciudad"),
    @Mapping(target = "state", source = "estado"),
  })
  AddressDTO toAddressDTO(Direccion direccion);

  @InheritInverseConfiguration
  Direccion toDireccion(AddressDTO addressDTO);
}
