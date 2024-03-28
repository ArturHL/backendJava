package com.malu.antojitos_malu.DataBase.Mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import com.malu.antojitos_malu.DataBase.Entities.Usuario;
import com.malu.antojitos_malu.Domain.DTO.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {
  @Mappings({
    @Mapping(target = "id", source = "idUsuarios"),
    @Mapping(target = "name", source = "nombre"),
    @Mapping(target = "email", source = "correo"),
    @Mapping(target = "phone", source = "telefono"),
    @Mapping(target = "password", source = "contrasena"),
  })
  UserDTO toUserDTO(Usuario Usuario);
  List<UserDTO> toUsersDTOs(List<Usuario> Usuarios);

  @InheritInverseConfiguration
  Usuario toUsuario(UserDTO userDTO);
}
