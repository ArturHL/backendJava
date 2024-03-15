package com.malu.antojitos_malu.DataBase.CRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malu.antojitos_malu.DataBase.Entities.Orden;

public interface OrdenCRUD extends CrudRepository<Orden, Integer>{

  List<Orden> findByIdUsuario(int id);

  List<Orden> findByEstatus(String estatus);

  List<Orden> findByFecha(String fecha);

}
