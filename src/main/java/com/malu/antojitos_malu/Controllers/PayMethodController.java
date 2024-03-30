package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.malu.antojitos_malu.Domain.DTO.PayMethodDTO;
import com.malu.antojitos_malu.Domain.Services.PayMethodService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payMethod")
public class PayMethodController {
  @Autowired
  private PayMethodService service;

  @GetMapping("/all")
  public Optional<List<PayMethodDTO>> getAll(){
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Optional<PayMethodDTO> getPayMethodById(@PathVariable("id") int id){
    return service.getPayMethodById(id);
  }

  @GetMapping("/userId/{userId}")
  public Optional<List<PayMethodDTO>> getByUserId(@PathVariable("userId") int userId){
    return service.getByUserId(userId);
  }

  @PostMapping("/save")
  public PayMethodDTO save(@RequestBody PayMethodDTO payMethodDTO){
    return service.save(payMethodDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<PayMethodDTO> deleteById(@PathVariable("id") int id){
    return service.deleteById(id);
  }

  @PutMapping("/{id}")
  public Optional<PayMethodDTO> updateById(@PathVariable("id") int id, @RequestBody PayMethodDTO payMethodDTO){
    return service.updateById(id, payMethodDTO);
  }
}
