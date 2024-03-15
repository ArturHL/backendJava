package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.Categoria;

public interface CategoriaCRUD extends CrudRepository<Categoria, Integer>{
  
  List<Categoria> findByNombre(String nombre);

}
