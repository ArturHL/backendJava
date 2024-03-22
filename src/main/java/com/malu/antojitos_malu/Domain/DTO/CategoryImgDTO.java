package com.malu.antojitos_malu.Domain.DTO;

public class CategoryImgDTO {
  private int id;

  private int idCategory;

  private String url;

  // Getters and Setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getIdCategory() {
    return idCategory;
  }

  public void setIdCategory(int idCategory) {
    this.idCategory = idCategory;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  
}
