package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.ImagenesProductoCRUD;

import com.malu.antojitos_malu.DataBase.Entities.ImagenesProducto;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ImagenesProductoRepository {
  private ImagenesProductoCRUD imagenesProductoCRUD;

  public List<ImagenesProducto> getAll(){
    return (List<ImagenesProducto>) imagenesProductoCRUD.findAll();
  }

  public ImagenesProducto save(ImagenesProducto imagenesProducto){
    return imagenesProductoCRUD.save(imagenesProducto);
  }

  public void delete(ImagenesProducto imagenesProducto){
    imagenesProductoCRUD.delete(imagenesProducto);
  }

  public List<ImagenesProducto> findByProductoId(int id){
    return imagenesProductoCRUD.findByIdProducto(id);
  }
  
}
