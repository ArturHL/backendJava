package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.Reserva;

public interface ReservaCRUD extends CrudRepository<Reserva, Integer>{
  
  List<Reserva> findByIdUsuario(int id);

}
