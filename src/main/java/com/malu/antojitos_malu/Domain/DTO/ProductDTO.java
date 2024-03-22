package com.malu.antojitos_malu.Domain.DTO;

import java.util.List;

public class ProductDTO {
  private int id;

  private String name;

  private boolean available;

  private String price;
  
  private List<ProductImgDTO> images;

  private CategoryDTO category;

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

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public List<ProductImgDTO> getImages() {
    return images;
  }

  public void setImages(List<ProductImgDTO> images) {
    this.images = images;
  }

  public CategoryDTO getCategory() {
    return category;
  }

  public void setCategory(CategoryDTO category) {
    this.category = category;
  }
}
