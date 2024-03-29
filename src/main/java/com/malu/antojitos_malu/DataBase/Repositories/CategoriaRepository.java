package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.CategoriaCRUD;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.malu.antojitos_malu.DataBase.Entities.Categoria;
import com.malu.antojitos_malu.DataBase.Mappers.CategoryMapper;
import com.malu.antojitos_malu.Domain.DTO.CategoryDTO;
import com.malu.antojitos_malu.Domain.Repositories.CategoryRepo;

@Repository
public class CategoriaRepository implements CategoryRepo {
  private CategoriaCRUD categoriaCRUD;
  private CategoryMapper mapper;

  @Override
  public Optional<List<CategoryDTO>> getAll(){
    List<Categoria> categorias = (List<Categoria>) categoriaCRUD.findAll();
    List<CategoryDTO> categories = mapper.toCategoriesDTOs(categorias);
    return Optional.of(categories);
  }

  @Override
  public Optional<CategoryDTO> getCategoryById(int id){
    Categoria categoria = categoriaCRUD.findById(id).get();
    CategoryDTO category = mapper.toCategoryDTO(categoria);
    return Optional.of(category);
  }

  @Override
  public Optional<CategoryDTO> getCategoryByName(String name){
    Categoria categoria = (Categoria) categoriaCRUD.findByNombre(name);
    CategoryDTO category = mapper.toCategoryDTO(categoria);
    return Optional.of(category);
  }

  @Override
  public CategoryDTO save(CategoryDTO categoryDTO){
    Categoria categoria = mapper.toCategoria(categoryDTO);
    Categoria categoriaSaved = categoriaCRUD.save(categoria);
    return mapper.toCategoryDTO(categoriaSaved);
  }

  @Override
  public Optional<CategoryDTO> deleteById(int id){
    Optional<CategoryDTO> category = getCategoryById(id);
    if (category.isPresent()) {
      categoriaCRUD.deleteById(id);
      return category;
    }
    return Optional.empty();
  }

  @Override
  public Optional<CategoryDTO> updateById(int id, CategoryDTO categoryDTO){
    Optional<CategoryDTO> category = getCategoryById(id);
    if (category.isPresent()) {
      Categoria categoria = mapper.toCategoria(categoryDTO);
      categoria.setIdCategoria(id);
      Categoria categoriaUpdated = categoriaCRUD.save(categoria);
      return Optional.of(mapper.toCategoryDTO(categoriaUpdated));
    }
    return Optional.empty();
  }

}
