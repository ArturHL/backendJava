package com.malu.antojitos_malu.Domain.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malu.antojitos_malu.Domain.DTO.ProductImgDTO;
import com.malu.antojitos_malu.Domain.Repositories.ProductImgRepo;


@Service
public class ProductImgService {
  @Autowired
  private ProductImgRepo productImgRepo;

  public Optional<ProductImgDTO> getImgByProductId(int productId){
    return productImgRepo.getProductImgById(productId);
  }

  public ProductImgDTO save(ProductImgDTO productImgDTO){
    return productImgRepo.save(productImgDTO);
  }

  public Optional<ProductImgDTO> deleteByProductId(int productId){
    return productImgRepo.deleteByProductId(productId);
  }

  public Optional<ProductImgDTO> updateByProductId(int productId, ProductImgDTO productImgDTO){
    return productImgRepo.updateByProductId(productId, productImgDTO);
  }
}
