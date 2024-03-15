package com.malu.antojitos_malu.DataBase.CRUD;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.Producto;

import java.util.List;

public interface ProductoCRUD extends CrudRepository<Producto, Integer>{
  
  List<Producto> findByIdCategoriaOrderByPrecioDesc(int id);

}
