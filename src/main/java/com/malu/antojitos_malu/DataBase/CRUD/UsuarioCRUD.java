package com.malu.antojitos_malu.DataBase.CRUD;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.Usuario;

public interface UsuarioCRUD extends CrudRepository<Usuario, Integer>{
  
  Usuario findByNombre(String nombre);

  Usuario findByIdUsuarios(int id);

}
