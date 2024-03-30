package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.malu.antojitos_malu.Domain.DTO.UserDTO;
import com.malu.antojitos_malu.Domain.Services.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService service;

  @GetMapping("/all")
  public Optional<List<UserDTO>> getAll(){
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Optional<UserDTO> getUserById(@PathVariable("id") int id){
    return service.getUserById(id);
  }

  @PostMapping("/save")
  public UserDTO save(@RequestBody UserDTO userDTO){
    return service.save(userDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<UserDTO> deleteById(@PathVariable("id") int id){
    return service.deleteById(id);
  }

  @PutMapping("/{id}")
  public Optional<UserDTO> updateById(@PathVariable("id") int id, @RequestBody UserDTO userDTO){
    return service.updateById(id, userDTO);
  }

  @GetMapping("/email/{email}")
  public Optional<UserDTO> getUserByEmail(@PathVariable("email") String email){
    return service.getUserByEmail(email);
  }
}
