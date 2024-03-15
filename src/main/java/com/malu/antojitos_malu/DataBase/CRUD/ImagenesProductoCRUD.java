package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesProducto;

public interface ImagenesProductoCRUD extends CrudRepository<ImagenesProducto, Integer>{
  
  List<ImagenesProducto> findByIdProducto(int id);

}
