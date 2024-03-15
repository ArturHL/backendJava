package com.malu.antojitos_malu.DataBase;

import com.malu.antojitos_malu.DataBase.CRUD.ImagenesCategoriaCRUD;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesCategoria;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ImagenesCategoriaRepository {
  private ImagenesCategoriaCRUD imagenesCategoriaCRUD;

  public List<ImagenesCategoria> getAll(){
    return (List<ImagenesCategoria>) imagenesCategoriaCRUD.findAll();
  }

  public ImagenesCategoria save(ImagenesCategoria imagenesCategoria){
    return imagenesCategoriaCRUD.save(imagenesCategoria);
  }

  public void delete(ImagenesCategoria imagenesCategoria){
    imagenesCategoriaCRUD.delete(imagenesCategoria);
  }

  public List<ImagenesCategoria> findByCategoriaId(int id){
    return imagenesCategoriaCRUD.findByIdCategoria(id);
  }
  
}
