package com.malu.antojitos_malu.Domain.Repositories;

import java.util.List;
import java.util.Optional;

import com.malu.antojitos_malu.Domain.DTO.PayMethodDTO;

public interface PayMethodRepo {
  Optional<List<PayMethodDTO>> getAll();
  Optional<PayMethodDTO> getPayMethodById(int id);
  Optional<List<PayMethodDTO>> getByUserId(int userId);
  PayMethodDTO save(PayMethodDTO payMethodDTO);
  Optional<PayMethodDTO> deleteById(int id);
  Optional<PayMethodDTO> updateById(int id, PayMethodDTO payMethodDTO);
}
