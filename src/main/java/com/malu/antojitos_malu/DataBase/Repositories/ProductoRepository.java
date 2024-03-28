package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.ProductoCRUD;
import com.malu.antojitos_malu.DataBase.Mappers.ProductMapper;
import com.malu.antojitos_malu.DataBase.Entities.Producto;
import com.malu.antojitos_malu.Domain.DTO.ProductDTO;
import com.malu.antojitos_malu.Domain.Repositories.ProductRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepository implements ProductRepo{
  private ProductoCRUD productoCRUD;
  private ProductMapper mapper;

  @Override
  public Optional<List<ProductDTO>> getAll(){
    List<Producto> productos = (List<Producto>) productoCRUD.findAll();
    return Optional.of(mapper.toProductsDTOs(productos));
  }

  @Override
  public Optional<ProductDTO> getProductById(int id){
    Optional<Producto> producto = productoCRUD.findById(id);
    if (producto.isPresent()) {
      return Optional.of(mapper.toProductDTO(producto.get()));
    }
    return Optional.empty();
  }

  @Override
  public Optional<List<ProductDTO>> getByCategoryId(int categoryId){
    List<Producto> productos = (List<Producto>) productoCRUD.findByIdCategoriaOrderByPrecioDesc(categoryId);
    return Optional.of(mapper.toProductsDTOs(productos));
  }

  @Override
  public ProductDTO save(ProductDTO productDTO){
    Producto producto = mapper.toProducto(productDTO);
    Producto productoSaved = productoCRUD.save(producto);
    return mapper.toProductDTO(productoSaved);
  }

  @Override
  public Optional<ProductDTO> deleteById(int id){
    Optional<ProductDTO> product = getProductById(id);
    if (product.isPresent()) {
      productoCRUD.deleteById(id);
      return product;
    }
    return Optional.empty();
  }

  @Override
  public Optional<ProductDTO> updateById(int id, ProductDTO productDTO){
    Optional<Producto> product = productoCRUD.findById(id);
    if (product.isPresent()) {
      Producto producto = mapper.toProducto(productDTO);
      producto.setIdProducto(id);
      Producto productoSaved = productoCRUD.save(producto);
      return Optional.of(mapper.toProductDTO(productoSaved));
    }
    return Optional.empty();
  }
}
