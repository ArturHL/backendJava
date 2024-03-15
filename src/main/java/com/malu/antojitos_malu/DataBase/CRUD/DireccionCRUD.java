package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.Direccion;

public interface DireccionCRUD  extends CrudRepository<Direccion, Integer>{
  
  List<Direccion> findByIdUsuario(int id);

}
