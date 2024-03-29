package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malu.antojitos_malu.Domain.Services.CategoryService;
import com.malu.antojitos_malu.Domain.DTO.CategoryDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/category")
public class CategoryController {
  @Autowired
  private CategoryService service;

  @GetMapping("/all")
  public Optional<List<CategoryDTO>> getAll(){
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Optional<CategoryDTO> getCategoryById(@PathVariable("id")int id){
    return service.getCategoryById(id);
  }

  @GetMapping("/name/{name}")
  public Optional<CategoryDTO> getCategoryByName(@PathVariable("name")String name){
    return service.getCategoryByName(name);
  }

  @PostMapping("/save")
  public CategoryDTO save(@RequestBody CategoryDTO categoryDTO){
    return service.save(categoryDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<CategoryDTO> deleteById(@PathVariable("id")int id){
    return service.deleteById(id);
  }

  @PutMapping("/{id}")
  public Optional<CategoryDTO> updateById(@PathVariable("id")int id, @RequestBody CategoryDTO categoryDTO){
    return service.updateById(id, categoryDTO);
  }
}
