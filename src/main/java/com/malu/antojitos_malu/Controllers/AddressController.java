package com.malu.antojitos_malu.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malu.antojitos_malu.Domain.Services.AddressService;
import com.malu.antojitos_malu.Domain.DTO.AddressDTO;

@RestController
@RequestMapping("/address")
public class AddressController {
  @Autowired
  private AddressService service;

  @GetMapping("/all")
  public Optional<List<AddressDTO>> getAll(){
    return service.getAll();
  }

  @GetMapping("/{UserId}")
  public Optional<List<AddressDTO>> getAllByUserId(@PathVariable("UserId")int UserId){
    return service.getAllByUserId(UserId);
  }

  @GetMapping("/search/{id}")
  public Optional<AddressDTO> getAddressById(@PathVariable("id")int id){
    return service.getAddressById(id);
  }

  @PostMapping("/save")
  public AddressDTO save(@RequestBody AddressDTO addressDTO){
    return service.save(addressDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<AddressDTO> deleteById(@PathVariable("id")int id){
    return service.deleteById(id);
  }

  @PutMapping("/{id}")
  public Optional<AddressDTO> updateById(@PathVariable("id")int id, @RequestBody AddressDTO addressDTO){
    return service.updateById(id, addressDTO);
  }

}
