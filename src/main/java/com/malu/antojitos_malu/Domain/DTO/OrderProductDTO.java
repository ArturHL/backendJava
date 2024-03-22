package com.malu.antojitos_malu.Domain.DTO;

public class OrderProductDTO {
  private int id;

  private String comment;

  private int quantity;

  private ProductDTO product;

  // Getters and Setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public ProductDTO getProduct() {
    return product;
  }

  public void setProduct(ProductDTO product) {
    this.product = product;
  }
}
