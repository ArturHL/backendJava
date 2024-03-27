package com.malu.antojitos_malu.Domain.Repositories;

import java.util.Optional;
import java.util.List;

import com.malu.antojitos_malu.Domain.DTO.OrderDTO;

public interface OrderRepo {
  Optional<List<OrderDTO>> getAll();
  Optional<OrderDTO> getOrderById(int id);
  OrderDTO save(OrderDTO orderDTO);
  Optional<OrderDTO> deleteById(int id);
  Optional<OrderDTO> updateById(int id, OrderDTO orderDTO);
  Optional<List<OrderDTO>> getByUserId(int userId);
  Optional<List<OrderDTO>> getByStatus(String status);
  Optional<List<OrderDTO>> getByDate(String date);
  Optional<OrderDTO> updateStatusById(int id, String status);
}
