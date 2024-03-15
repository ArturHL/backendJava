package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.ProductosOrden;

public interface ProductosOrdenCRUD extends CrudRepository<ProductosOrden, Integer>{

  List<ProductosOrden> findByIdOrden(int id);

}
