package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

import com.malu.antojitos_malu.Domain.DTO.OrderProductDTO;

import com.malu.antojitos_malu.Domain.Services.OrderProductService;
import java.util.Optional;

@RestController
@RequestMapping("/orderProduct")
public class OrderProductController {
  @Autowired
  private OrderProductService service;

  @GetMapping("/all")
  public Optional<List<OrderProductDTO>> getAll(){
    return service.getAll();
  }

  @GetMapping("/orderId/{id}")
  public Optional<List<OrderProductDTO>> getByOrderId(@PathVariable("id") int orderId){
    return service.getByOrderId(orderId);
  }

  @GetMapping("/{id}")
  public Optional<OrderProductDTO> getOrderProductById(@PathVariable("id") int id){
    return service.getOrderProductById(id);
  }

  @PostMapping("/save")
  public OrderProductDTO save(@RequestBody OrderProductDTO orderProductDTO){
    return service.save(orderProductDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<OrderProductDTO> deleteById(@PathVariable("id") int id){
    return service.deleteById(id);
  }

  @PutMapping("/{id}")
  public Optional<OrderProductDTO> updateById(@PathVariable("id") int id, @RequestBody OrderProductDTO orderProductDTO){
    return service.updateById(id, orderProductDTO);
  }
}
