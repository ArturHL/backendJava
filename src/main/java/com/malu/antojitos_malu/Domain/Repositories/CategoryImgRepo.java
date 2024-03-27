package com.malu.antojitos_malu.Domain.Repositories;

import java.util.Optional;

import com.malu.antojitos_malu.Domain.DTO.CategoryImgDTO;

public interface CategoryImgRepo {
  Optional<CategoryImgDTO> getImgByCategoryId(int id);
  CategoryImgDTO save(CategoryImgDTO categoryImgDTO);
  Optional<CategoryImgDTO> deleteByCategoryId(int id);
  Optional<CategoryImgDTO> updateByCategoryId(int id, CategoryImgDTO categoryImgDTO);
}
