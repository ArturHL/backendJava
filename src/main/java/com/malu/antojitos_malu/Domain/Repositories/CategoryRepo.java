package com.malu.antojitos_malu.Domain.Repositories;

import java.util.Optional;

import com.malu.antojitos_malu.Domain.DTO.CategoryDTO;

public interface CategoryRepo {
  Optional<CategoryDTO> getAll();
  Optional<CategoryDTO> getCategoryByName(String name);
  CategoryDTO save(CategoryDTO categoryDTO);
  Optional<CategoryDTO> deleteById(int id);
  Optional<CategoryDTO> updateById(int id, CategoryDTO categoryDTO);
}
