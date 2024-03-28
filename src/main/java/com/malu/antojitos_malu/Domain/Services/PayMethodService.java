package com.malu.antojitos_malu.Domain.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.malu.antojitos_malu.Domain.DTO.PayMethodDTO;
import com.malu.antojitos_malu.Domain.Repositories.PayMethodRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PayMethodService {
  @Autowired
  private PayMethodRepo payMethodRepo;

  public Optional<List<PayMethodDTO>> getAll(){
    return payMethodRepo.getAll();
  }

  public Optional<PayMethodDTO> getPayMethodById(int id){
    return payMethodRepo.getPayMethodById(id);
  }

  public Optional<List<PayMethodDTO>> getByUserId(int userId){
    return payMethodRepo.getByUserId(userId);
  }

  public PayMethodDTO save(PayMethodDTO payMethodDTO){
    return payMethodRepo.save(payMethodDTO);
  }

  public Optional<PayMethodDTO> deleteById(int id){
    return payMethodRepo.deleteById(id);
  }

  public Optional<PayMethodDTO> updateById(int id, PayMethodDTO payMethodDTO){
    return payMethodRepo.updateById(id, payMethodDTO);
  }
}
