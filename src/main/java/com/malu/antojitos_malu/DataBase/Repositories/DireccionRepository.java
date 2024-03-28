package com.malu.antojitos_malu.DataBase.Repositories;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.malu.antojitos_malu.DataBase.Entities.Direccion;
import com.malu.antojitos_malu.Domain.Repositories.AddressRepo;
import com.malu.antojitos_malu.DataBase.Mappers.AddressMapper;
import com.malu.antojitos_malu.Domain.DTO.AddressDTO;
import com.malu.antojitos_malu.DataBase.CRUD.DireccionCRUD;

@Repository
public class DireccionRepository implements AddressRepo{
  private DireccionCRUD direccionCRUD;
  private AddressMapper mapper;

  @Override
  public Optional<List<AddressDTO>> getAll(){
    List<Direccion> direcciones = (List<Direccion>) direccionCRUD.findAll();
    List<AddressDTO> addresses = mapper.toAddressesDTOs(direcciones);
    return Optional.of(addresses);
  }

  @Override
  public Optional<List<AddressDTO>> getAllByUserId(int UserId){
    List<Direccion> direcciones = (List<Direccion>) direccionCRUD.findByIdUsuario(UserId);
    List<AddressDTO> addresses = mapper.toAddressesDTOs(direcciones);
    return Optional.of(addresses);
  }

  @Override
  public Optional<AddressDTO> getAddressById(int id){
    Optional<Direccion> direccion = direccionCRUD.findById(id);
    if (direccion.isPresent()) {
      return Optional.of(mapper.toAddressDTO(direccion.get()));
    }
    return Optional.empty();
  }

  @Override
  public AddressDTO save(AddressDTO addressDTO){
    Direccion direccion = mapper.toDireccion(addressDTO);
    Direccion direccionSaved = direccionCRUD.save(direccion);
    return mapper.toAddressDTO(direccionSaved);
  }

  @Override
  public Optional<AddressDTO> deleteById(int id){
    Optional<AddressDTO> address = getAddressById(id);
    if (address.isPresent()) {
      direccionCRUD.deleteById(id);
      return address;
    }
    return Optional.empty();
  }

  @Override
  public Optional<AddressDTO> updateById(int id, AddressDTO addressDTO){
    Optional<AddressDTO> address = getAddressById(id);
    if (address.isPresent()) {
      Direccion direccion = mapper.toDireccion(addressDTO);
      direccion.setIdDireccion(id);
      Direccion direccionUpdated = direccionCRUD.save(direccion);
      return Optional.of(mapper.toAddressDTO(direccionUpdated));
    }
    return Optional.empty();
  }
}
