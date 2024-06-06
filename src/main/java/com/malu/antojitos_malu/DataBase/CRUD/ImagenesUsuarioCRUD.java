package com.malu.antojitos_malu.DataBase.CRUD;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesUsuario;

public interface ImagenesUsuarioCRUD extends CrudRepository<ImagenesUsuario, Integer>{

  Optional<ImagenesUsuario> findByIdUsuario(int id);

}
