package com.malu.antojitos_malu.Domain.Repositories;

import java.util.List;
import java.util.Optional;

import com.malu.antojitos_malu.Domain.DTO.OrderProductDTO;

public interface OrderProductRepo {
  Optional<List<OrderProductDTO>> getAll();
  Optional<List<OrderProductDTO>> getByOrderId(int orderId);
  OrderProductDTO save(OrderProductDTO orderProductDTO);
  Optional<OrderProductDTO> deleteById(int id);
  Optional<OrderProductDTO> updateById(int id, OrderProductDTO orderProductDTO);
}
