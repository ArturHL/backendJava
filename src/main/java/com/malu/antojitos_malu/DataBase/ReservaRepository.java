package com.malu.antojitos_malu.DataBase;

import com.malu.antojitos_malu.DataBase.CRUD.ReservaCRUD;

import com.malu.antojitos_malu.DataBase.Entities.Reserva;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ReservaRepository {
  private ReservaCRUD reservaCRUD;

  public List<Reserva> getAll(){
    return (List<Reserva>) reservaCRUD.findAll();
  }

  public Reserva save(Reserva reserva){
    return reservaCRUD.save(reserva);
  }

  public void delete(Reserva reserva){
    reservaCRUD.delete(reserva);
  }

  public List<Reserva> findByUsuarioId(int id){
    return reservaCRUD.findByIdUsuario(id);
  }
}
