package com.malu.antojitos_malu.Domain.DTO;

public class OrderDTO {
    private int id;
    
    private int idUser;
    
    private String date;
    
    private String total;
    
    private String status;

    // Getters and Setters

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public int getIdUser() {
      return idUser;
    }

    public void setIdUser(int idUser) {
      this.idUser = idUser;
    }

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public String getTotal() {
      return total;
    }

    public void setTotal(String total) {
      this.total = total;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }
  }
