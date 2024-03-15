package com.malu.antojitos_malu.DataBase;

import com.malu.antojitos_malu.DataBase.CRUD.MetodoPagoCRUD;

import com.malu.antojitos_malu.DataBase.Entities.MetodoPago;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MetodoPagoRepository {
  private MetodoPagoCRUD metodoPagoCRUD;

  public List<MetodoPago> getAll(){
    return (List<MetodoPago>) metodoPagoCRUD.findAll();
  }

  public MetodoPago save(MetodoPago metodoPago){
    return metodoPagoCRUD.save(metodoPago);
  }

  public void delete(MetodoPago metodoPago){
    metodoPagoCRUD.delete(metodoPago);
  }

  public List<MetodoPago> findByUsuarioId(int id){
    return metodoPagoCRUD.findByIdUsuario(id);
  }
  
}
