package com.malu.antojitos_malu.Domain.Repositories;

import java.util.Optional;
import java.util.List;

import com.malu.antojitos_malu.Domain.DTO.ProductDTO;

public interface ProductRepo {
  Optional<List<ProductDTO>> getAll();
  Optional<ProductDTO> getProductById(int id);
  Optional<List<ProductDTO>> getByCategoryId(int CategoryId);
  ProductDTO save(ProductDTO productDTO);
  Optional<ProductDTO> deleteById(int id);
  Optional<ProductDTO> updateById(int id, ProductDTO productDTO);
}
