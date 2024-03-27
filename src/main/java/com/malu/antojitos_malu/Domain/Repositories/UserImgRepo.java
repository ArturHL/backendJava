package com.malu.antojitos_malu.Domain.Repositories;

import java.util.Optional;

import com.malu.antojitos_malu.Domain.DTO.UserImgDTO;

public interface UserImgRepo {
  Optional<String> getImgByUserId(int id);
  UserImgDTO save(UserImgDTO userImgDTO);
  Optional<UserImgDTO> deleteByUserId(int id);
  Optional<UserImgDTO> updateByUserId(int id, UserImgDTO userImgDTO);
}
