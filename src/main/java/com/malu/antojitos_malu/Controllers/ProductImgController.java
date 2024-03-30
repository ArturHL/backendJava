package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.malu.antojitos_malu.Domain.DTO.ProductImgDTO;
import com.malu.antojitos_malu.Domain.Services.ProductImgService;

import java.util.Optional;

@RestController
@RequestMapping("/productImg")
public class ProductImgController {
  @Autowired
  private ProductImgService service;

  @GetMapping("/productId/{productId}")
  public Optional<ProductImgDTO> getImgByProductId(@PathVariable("productId") int productId){
    return service.getImgByProductId(productId);
  }

  @PostMapping("/save")
  public ProductImgDTO save(@RequestBody ProductImgDTO productImgDTO){
    return service.save(productImgDTO);
  }

  @DeleteMapping("/productId/{productId}")
  public Optional<ProductImgDTO> deleteByProductId(@PathVariable("productId") int productId){
    return service.deleteByProductId(productId);
  }

  @PutMapping("/productId/{productId}")
  public Optional<ProductImgDTO> updateByProductId(@PathVariable("productId") int productId, @RequestBody ProductImgDTO productImgDTO){
    return service.updateByProductId(productId, productImgDTO);
  }
}
