package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.ProductoCRUD;

import com.malu.antojitos_malu.DataBase.Entities.Producto;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepository {
  private ProductoCRUD productoCRUD;

  public List<Producto> getAll(){
    return (List<Producto>) productoCRUD.findAll();
  }

  public Producto save(Producto producto){
    return productoCRUD.save(producto);
  }

  public void delete(Producto producto){
    productoCRUD.delete(producto);
  }

  public List<Producto> findByCategoriaId(int id){
    return productoCRUD.findByIdCategoriaOrderByPrecioDesc(id);
  }
}
