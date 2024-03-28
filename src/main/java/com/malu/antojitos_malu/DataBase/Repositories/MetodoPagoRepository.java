package com.malu.antojitos_malu.DataBase.Repositories;

import com.malu.antojitos_malu.DataBase.CRUD.MetodoPagoCRUD;
import com.malu.antojitos_malu.DataBase.Entities.MetodoPago;
import com.malu.antojitos_malu.DataBase.Mappers.PayMethodMapper;
import com.malu.antojitos_malu.Domain.Repositories.PayMethodRepo;
import com.malu.antojitos_malu.Domain.DTO.PayMethodDTO;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class MetodoPagoRepository implements PayMethodRepo {
  private MetodoPagoCRUD metodoPagoCRUD;
  private PayMethodMapper mapper;

  @Override
  public Optional<List<PayMethodDTO>> getAll(){
    List<MetodoPago> metodosPago = (List<MetodoPago>) metodoPagoCRUD.findAll();
    List<PayMethodDTO> payMethods = mapper.toPayMethodsDTOs(metodosPago);
    return Optional.of(payMethods);
  }

  @Override
  public Optional<PayMethodDTO> getPayMethodById(int id){
    MetodoPago metodoPago = metodoPagoCRUD.findById(id).get();
    PayMethodDTO payMethod = mapper.toPayMethodDTO(metodoPago);
    return Optional.of(payMethod);
  }

  @Override
  public Optional<List<PayMethodDTO>> getByUserId(int userId){
    List<MetodoPago> metodosPago = (List<MetodoPago>) metodoPagoCRUD.findByIdUsuario(userId);
    List<PayMethodDTO> payMethods = mapper.toPayMethodsDTOs(metodosPago);
    return Optional.of(payMethods);
  }

  @Override
  public PayMethodDTO save(PayMethodDTO payMethodDTO){
    MetodoPago metodoPago = mapper.toMetodoPago(payMethodDTO);
    MetodoPago metodoPagoSaved = metodoPagoCRUD.save(metodoPago);
    return mapper.toPayMethodDTO(metodoPagoSaved);
  }

  @Override
  public Optional<PayMethodDTO> deleteById(int id){
    Optional<PayMethodDTO> payMethod = getPayMethodById(id);
    if (payMethod.isPresent()) {
      metodoPagoCRUD.deleteById(id);
      return payMethod;
    }
    return Optional.empty();
  }

  @Override
  public Optional<PayMethodDTO> updateById(int id, PayMethodDTO payMethodDTO){
    Optional<PayMethodDTO> payMethod = getPayMethodById(id);
    if(payMethod.isPresent()){
      MetodoPago metodoPago = mapper.toMetodoPago(payMethodDTO);
      metodoPago.setIdMetodoPago(id);
      MetodoPago metodoPagoUpdated = metodoPagoCRUD.save(metodoPago);
      return Optional.of(mapper.toPayMethodDTO(metodoPagoUpdated));
    }
    return Optional.empty();
  }
}
