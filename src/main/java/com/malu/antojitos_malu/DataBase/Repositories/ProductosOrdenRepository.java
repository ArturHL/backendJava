package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.ProductosOrdenCRUD;

import com.malu.antojitos_malu.DataBase.Entities.ProductosOrden;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductosOrdenRepository {
  private ProductosOrdenCRUD productosOrdenCRUD;

  public List<ProductosOrden> getAll(){
    return (List<ProductosOrden>) productosOrdenCRUD.findAll();
  }

  public ProductosOrden save(ProductosOrden productosOrden){
    return productosOrdenCRUD.save(productosOrden);
  }

  public void delete(ProductosOrden productosOrden){
    productosOrdenCRUD.delete(productosOrden);
  }

  public List<ProductosOrden> findByOrdenId(int id){
    return productosOrdenCRUD.findByIdOrden(id);
  }
}
