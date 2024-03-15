package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesUsuario;

public interface ImagenesUsuarioCRUD extends CrudRepository<ImagenesUsuario, Integer>{

  List<ImagenesUsuario> findByIdUsuario(int id);

}
