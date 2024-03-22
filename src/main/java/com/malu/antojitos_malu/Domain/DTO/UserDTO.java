package com.malu.antojitos_malu.Domain.DTO;

import java.util.List;

public class UserDTO {
  private int id;

  private String name;

  private String email;

  private String phone;

  private String password;

  private List<OrderDTO> orders;

  private List<BookingDTO> bookings;

  private List<AddressDTO> addresses;

  private List<UserImgDTO> images;

  private List<PayMethodDTO> paymentMethods;

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<OrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderDTO> orders) {
    this.orders = orders;
  }

  public List<BookingDTO> getBookings() {
    return bookings;
  }

  public void setBookings(List<BookingDTO> bookings) {
    this.bookings = bookings;
  }

  public List<AddressDTO> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AddressDTO> addresses) {
    this.addresses = addresses;
  }

  public List<UserImgDTO> getImages() {
    return images;
  }

  public void setImages(List<UserImgDTO> images) {
    this.images = images;
  }

  public List<PayMethodDTO> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<PayMethodDTO> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }
}
