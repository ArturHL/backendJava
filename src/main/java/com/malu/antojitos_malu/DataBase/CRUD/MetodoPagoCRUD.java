package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.MetodoPago;

public interface MetodoPagoCRUD extends CrudRepository<MetodoPago, Integer>{

  List<MetodoPago> findByIdUsuario(int id);

}
