package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malu.antojitos_malu.Domain.Services.CategoryImgService;
import com.malu.antojitos_malu.Domain.DTO.CategoryImgDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@RestController
@RequestMapping("/categoryimg")
public class CategoryImgController {
  @Autowired
  private CategoryImgService service;

  @GetMapping("/{id}")
  public Optional<CategoryImgDTO> getImgByCategoryId(@PathVariable("id")int id) {
    return service.getImgByCategoryId(id);
  }

  @PostMapping("/save")
  public CategoryImgDTO save(@RequestBody CategoryImgDTO categoryImgDTO) {
    return service.save(categoryImgDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<CategoryImgDTO> deleteByCategoryId(@PathVariable("id")int id) {
    return service.deleteByCategoryId(id);
  }

  @PutMapping("/{id}")
  public Optional<CategoryImgDTO> updateByCategoryId(@PathVariable("id")int id, @RequestBody CategoryImgDTO categoryImgDTO) {
    return service.updateByCategoryId(id, categoryImgDTO);
  }
}
