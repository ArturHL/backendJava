package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.ImagenesProductoCRUD;
import com.malu.antojitos_malu.DataBase.Entities.ImagenesProducto;
import com.malu.antojitos_malu.Domain.DTO.ProductImgDTO;
import com.malu.antojitos_malu.Domain.Repositories.ProductImgRepo;
import com.malu.antojitos_malu.DataBase.Mappers.ProductImgMapper;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class ImagenesProductoRepository implements ProductImgRepo {
  private ImagenesProductoCRUD imagenesProductoCRUD;
  private ProductImgMapper mapper;  

  @Override
  public Optional<ProductImgDTO> getProductImgById(int id){
    Optional<ImagenesProducto> imagen = imagenesProductoCRUD.findById(id);
    if (imagen.isPresent()) {
      return Optional.of(mapper.toProductImgDTO(imagen.get()));
    }
    return Optional.empty();
  }

  @Override
  public ProductImgDTO save(ProductImgDTO productImgDTO){
    ImagenesProducto imagen = mapper.toImagenesProducto(productImgDTO);
    return mapper.toProductImgDTO(imagenesProductoCRUD.save(imagen));
  }

  @Override
  public Optional<ProductImgDTO> deleteByProductId(int id){
    Optional<ImagenesProducto> imagen = imagenesProductoCRUD.findById(id);
    if (imagen.isPresent()) {
      imagenesProductoCRUD.delete(imagen.get());
      return Optional.of(mapper.toProductImgDTO(imagen.get()));
    }
    return Optional.empty();
  }

  @Override
  public Optional<ProductImgDTO> updateByProductId(int id, ProductImgDTO productImgDTO){
    Optional<ImagenesProducto> imagen = imagenesProductoCRUD.findById(id);
    if (imagen.isPresent()) {
      ImagenesProducto imagenToUpdate = imagen.get();
      imagenToUpdate.setUrl(productImgDTO.getUrl());
      return Optional.of(mapper.toProductImgDTO(imagenesProductoCRUD.save(imagenToUpdate)));
    }
    return Optional.empty();
  }
}
