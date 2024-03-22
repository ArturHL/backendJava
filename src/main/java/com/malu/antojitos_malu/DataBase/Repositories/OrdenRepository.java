package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.OrdenCRUD;

import com.malu.antojitos_malu.DataBase.Entities.Orden;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class OrdenRepository {
  private OrdenCRUD ordenCRUD;

  public List<Orden> getAll(){
    return (List<Orden>) ordenCRUD.findAll();
  }

  public Orden save(Orden orden){
    return ordenCRUD.save(orden);
  }

  public void delete(Orden orden){
    ordenCRUD.delete(orden);
  }

  public List<Orden> findByUsuarioId(int id){
    return ordenCRUD.findByIdUsuario(id);
  }

  public List<Orden> findByEstatus(String estatus){
    return ordenCRUD.findByEstatus(estatus);
  }

  public List<Orden> findByFecha(String fecha){
    return ordenCRUD.findByFecha(fecha);
  }
}
