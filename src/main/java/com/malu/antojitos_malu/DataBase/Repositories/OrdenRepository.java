package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.OrdenCRUD;
import com.malu.antojitos_malu.Domain.Repositories.OrderRepo;
import com.malu.antojitos_malu.DataBase.Entities.Orden;
import com.malu.antojitos_malu.DataBase.Mappers.OrderMapper;
import com.malu.antojitos_malu.Domain.DTO.OrderDTO;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class OrdenRepository implements OrderRepo{
  private OrdenCRUD ordenCRUD;
  private OrderMapper mapper;

  @Override
  public Optional<List<OrderDTO>> getAll(){
    List<Orden> ordenes = (List<Orden>) ordenCRUD.findAll();
    List<OrderDTO> orders = mapper.toOrdersDTOs(ordenes);
    return Optional.of(orders);
  }

  @Override
  public Optional<OrderDTO> getOrderById(int id){
    Orden orden = ordenCRUD.findById(id).get();
    OrderDTO order = mapper.toOrderDTO(orden);
    return Optional.of(order);
  }

  @Override
  public OrderDTO save(OrderDTO orderDTO){
    Orden orden = mapper.toOrden(orderDTO);
    Orden ordenSaved = ordenCRUD.save(orden);
    return mapper.toOrderDTO(ordenSaved);
  }

  @Override
  public Optional<OrderDTO> deleteById(int id){
    Optional<OrderDTO> order = getOrderById(id);
    if (order.isPresent()) {
      ordenCRUD.deleteById(id);
      return order;
    }
    return Optional.empty();
  }

  @Override
  public Optional<List<OrderDTO>> getByUserId(int userId){
    List<Orden> ordenes = (List<Orden>) ordenCRUD.findByIdUsuario(userId);
    List<OrderDTO> orders = mapper.toOrdersDTOs(ordenes);
    return Optional.of(orders);
  }

  @Override
  public Optional<List<OrderDTO>> getByStatus(String status){
    List<Orden> ordenes = (List<Orden>) ordenCRUD.findByEstatus(status);
    List<OrderDTO> orders = mapper.toOrdersDTOs(ordenes);
    return Optional.of(orders);
  }

  @Override
  public Optional<List<OrderDTO>> getByDate(String date){
    List<Orden> ordenes = (List<Orden>) ordenCRUD.findByFecha(date);
    List<OrderDTO> orders = mapper.toOrdersDTOs(ordenes);
    return Optional.of(orders);
  }

  @Override
  public Optional<OrderDTO> updateStatusById(int id, String status){
    Optional<Orden> order = ordenCRUD.findById(id);
    if (order.isPresent()) {
      Orden orderToUpdate = order.get();
      orderToUpdate.setEstatus(status);
      return Optional.of(mapper.toOrderDTO(ordenCRUD.save(orderToUpdate)));
    }
    return Optional.empty();
  }
}
