package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.DireccionCRUD;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.malu.antojitos_malu.DataBase.Entities.Direccion;

@Repository
public class DireccionRepository {
  private DireccionCRUD direccionCRUD;

  public List<Direccion> getAll(){
    return (List<Direccion>) direccionCRUD.findAll();
  }

  public Direccion save(Direccion direccion){
    return direccionCRUD.save(direccion);
  }

  public void delete(Direccion direccion){
    direccionCRUD.delete(direccion);
  }

  public List<Direccion> findByUsuarioId(int id){
    return direccionCRUD.findByIdUsuario(id);
  }
  
}
