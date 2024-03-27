package com.malu.antojitos_malu.Domain.Repositories;

import com.malu.antojitos_malu.Domain.DTO.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressRepo {
  Optional<List<AddressDTO>> getAll();
  Optional<List<AddressDTO>> getAllByUserId(int UserId);
  AddressDTO save(AddressDTO addressDTO);
  Optional<AddressDTO> deleteById(int id);
  Optional<AddressDTO> updateById(int id, AddressDTO addressDTO);
}
