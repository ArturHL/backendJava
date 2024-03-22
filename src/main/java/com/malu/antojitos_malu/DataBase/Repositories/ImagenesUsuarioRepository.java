package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.ImagenesUsuarioCRUD;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesUsuario;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ImagenesUsuarioRepository {
  private ImagenesUsuarioCRUD imagenesUsuarioCRUD;

  public List<ImagenesUsuario> getAll(){
    return (List<ImagenesUsuario>) imagenesUsuarioCRUD.findAll();
  }

  public ImagenesUsuario save(ImagenesUsuario imagenesUsuario){
    return imagenesUsuarioCRUD.save(imagenesUsuario);
  }

  public void delete(ImagenesUsuario imagenesUsuario){
    imagenesUsuarioCRUD.delete(imagenesUsuario);
  }

  public List<ImagenesUsuario> findByUsuarioId(int id){
    return imagenesUsuarioCRUD.findByIdUsuario(id);
  }

}
