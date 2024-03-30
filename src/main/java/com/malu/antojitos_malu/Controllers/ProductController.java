package com.malu.antojitos_malu.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.malu.antojitos_malu.Domain.DTO.ProductDTO;
import com.malu.antojitos_malu.Domain.Services.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
  @Autowired
  private ProductService service;

  @GetMapping("/all")
  public Optional<List<ProductDTO>> getAll(){
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Optional<ProductDTO> getProductById(@PathVariable("id") int id){
    return service.getProductById(id);
  }

  @GetMapping("/categoryId/{categoryId}")
  public Optional<List<ProductDTO>> getByCategoryId(@PathVariable("categoryId") int categoryId){
    return service.getByCategoryId(categoryId);
  }

  @PostMapping("/save")
  public ProductDTO save(@RequestBody ProductDTO productDTO){
    return service.save(productDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<ProductDTO> deleteById(@PathVariable("id") int id){
    return service.deleteById(id);
  }

  @PutMapping("/{id}")
  public Optional<ProductDTO> updateById(@PathVariable("id") int id, @RequestBody ProductDTO productDTO){
    return service.updateById(id, productDTO);
  }

}
