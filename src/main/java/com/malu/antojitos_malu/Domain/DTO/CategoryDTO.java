package com.malu.antojitos_malu.Domain.DTO;

import java.util.List;

public class CategoryDTO {
  private int id;

  private String name;

  private List<ProductDTO> products;

  private List<CategoryImgDTO> images;

  // Getters and Setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ProductDTO> getProducts() {
    return products;
  }

  public void setProducts(List<ProductDTO> products) {
    this.products = products;
  }

  public List<CategoryImgDTO> getImages() {
    return images;
  }

  public void setImages(List<CategoryImgDTO> images) {
    this.images = images;
  }
  
}
