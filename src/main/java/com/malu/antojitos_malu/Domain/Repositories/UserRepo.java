package com.malu.antojitos_malu.Domain.Repositories;

import java.util.List;
import java.util.Optional;

import com.malu.antojitos_malu.Domain.DTO.UserDTO;

public interface UserRepo {
  Optional<List<UserDTO>> getAll();
  Optional<UserDTO> getUserById(int id);
  UserDTO save(UserDTO userDTO);
  Optional<UserDTO> deleteById(int id);
  Optional<UserDTO> updateById(int id, UserDTO userDTO);
  Optional<UserDTO> getUserByEmail(String email);
}
