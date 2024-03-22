package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.UsuarioCRUD;

import com.malu.antojitos_malu.DataBase.Entities.Usuario;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
  private UsuarioCRUD usuarioCRUD;

  public List<Usuario> getAll(){
    return (List<Usuario>) usuarioCRUD.findAll();
  }

  public Usuario save(Usuario usuario){
    return usuarioCRUD.save(usuario);
  }

  public void delete(Usuario usuario){
    usuarioCRUD.delete(usuario);
  }

  public Usuario findByNombre(String nombre){
    return usuarioCRUD.findByNombre(nombre);
  }

  public Usuario findByIdUsuarios(int id){
    return usuarioCRUD.findByIdUsuarios(id);
  }
}
