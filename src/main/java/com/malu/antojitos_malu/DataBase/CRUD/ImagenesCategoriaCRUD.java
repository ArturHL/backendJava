package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesCategoria;

public interface ImagenesCategoriaCRUD extends CrudRepository<ImagenesCategoria, Integer>{
  
  List<ImagenesCategoria> findByIdCategoria(int id);

}
