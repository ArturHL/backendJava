package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malu.antojitos_malu.Domain.Services.OrderService;
import com.malu.antojitos_malu.Domain.DTO.OrderDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
  @Autowired
  private OrderService service;

  @GetMapping("/all")
  public Optional<List<OrderDTO>> getAll() {
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Optional<OrderDTO> getOrderById(@PathVariable("id")int id) {
    return service.getOrderById(id);
  }

  @PostMapping("/save")
  public OrderDTO save(@RequestBody OrderDTO orderDTO) {
    return service.save(orderDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<OrderDTO> deleteById(@PathVariable("id")int id) {
    return service.deleteById(id);
  }

  @GetMapping("/user/{userId}")
  public Optional<List<OrderDTO>> getByUserId(@PathVariable("userId")int userId) {
    return service.getByUserId(userId);
  }

  @GetMapping("/status/{status}")
  public Optional<List<OrderDTO>> getByStatus(@PathVariable("status")String status) {
    return service.getByStatus(status);
  }

  @GetMapping("/date/{date}")
  public Optional<List<OrderDTO>> getByDate(@PathVariable("date")String date) {
    return service.getByDate(date);
  }

  @PutMapping("/status/{id}")
  public Optional<OrderDTO> updateStatusById(@PathVariable("id")int id, @RequestBody OrderDTO orderDTO) {
    return service.updateStatusById(id, orderDTO.getStatus());
  }

}
