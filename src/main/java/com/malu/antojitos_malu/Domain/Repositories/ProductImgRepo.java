package com.malu.antojitos_malu.Domain.Repositories;

import java.util.Optional;

import com.malu.antojitos_malu.Domain.DTO.ProductImgDTO;

public interface ProductImgRepo {
  Optional<ProductImgDTO> getProductImgById(int id);
  ProductImgDTO save(ProductImgDTO productImgDTO);
  Optional<ProductImgDTO> deleteByProductId(int id);
  Optional<ProductImgDTO> updateByProductId(int id, ProductImgDTO productImgDTO);
}
