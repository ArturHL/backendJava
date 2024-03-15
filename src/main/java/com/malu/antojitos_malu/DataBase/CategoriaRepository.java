package com.malu.antojitos_malu.DataBase;

import com.malu.antojitos_malu.DataBase.CRUD.CategoriaCRUD;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.malu.antojitos_malu.DataBase.Entities.Categoria;

@Repository
public class CategoriaRepository {
  private CategoriaCRUD categoriaCRUD;

  public List<Categoria> getAll(){
    return (List<Categoria>) categoriaCRUD.findAll();
  }

  public Categoria save(Categoria categoria){
    return categoriaCRUD.save(categoria);
  }

  public void delete(Categoria categoria){
    categoriaCRUD.delete(categoria);
  }

  public List<Categoria> findByNombre(String nombre){
    return categoriaCRUD.findByNombre(nombre);
  }
  
}
