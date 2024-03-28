package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.UsuarioCRUD;
import com.malu.antojitos_malu.DataBase.Entities.Usuario;
import com.malu.antojitos_malu.Domain.Repositories.UserRepo;
import com.malu.antojitos_malu.Domain.DTO.UserDTO;
import com.malu.antojitos_malu.DataBase.Mappers.UserMapper;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository implements UserRepo{
  private UsuarioCRUD usuarioCRUD;
  private UserMapper mapper;

  @Override
  public Optional<List<UserDTO>> getAll() {
    List<Usuario> usuarios = (List<Usuario>) usuarioCRUD.findAll();
    return Optional.of(mapper.toUsersDTOs(usuarios));
  }

  @Override
  public Optional<UserDTO> getUserById(int id) {
    Optional<Usuario> usuario = usuarioCRUD.findById(id);
    if (usuario.isPresent()) {
      return Optional.of(mapper.toUserDTO(usuario.get()));
    }
    return Optional.empty();
  }

  @Override
  public UserDTO save(UserDTO userDTO) {
    Usuario usuario = mapper.toUsuario(userDTO);
    return mapper.toUserDTO(usuarioCRUD.save(usuario));
  }

  @Override
  public Optional<UserDTO> deleteById(int id) {
    Optional<Usuario> usuario = usuarioCRUD.findById(id);
    if (usuario.isPresent()) {
      usuarioCRUD.deleteById(id);
      return Optional.of(mapper.toUserDTO(usuario.get()));
    }
    return Optional.empty();
  }

  @Override
  public Optional<UserDTO> updateById(int id, UserDTO userDTO) {
    Optional<Usuario> usuario = usuarioCRUD.findById(id);
    if (usuario.isPresent()) {
      Usuario usuarioToUpdate = usuario.get();
      usuarioToUpdate.setIdUsuarios(id);
      return Optional.of(mapper.toUserDTO(usuarioCRUD.save(usuarioToUpdate)));
    }
    return Optional.empty();
  }

  @Override
  public Optional<UserDTO> getUserByEmail(String email) {
    Usuario usuario = usuarioCRUD.findByCorreo(email);
    return Optional.of(mapper.toUserDTO(usuario));
  }

}
