package com.malu.antojitos_malu.Domain.DTO;

public class BookingDTO {
  private int id;

  private String date;
  
  private int attendees;

  // Getters and Setters
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getAttendees() {
    return attendees;
  }

  public void setAttendees(int attendees) {
    this.attendees = attendees;
  }

  
}
