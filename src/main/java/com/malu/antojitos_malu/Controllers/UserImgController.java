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
import com.malu.antojitos_malu.Domain.DTO.UserImgDTO;
import com.malu.antojitos_malu.Domain.Services.UserImgService;

import java.util.Optional;

@RestController
@RequestMapping("/userImg")
public class UserImgController {
  @Autowired
  private UserImgService service;

  @GetMapping("/userId/{userId}")
  public Optional<UserImgDTO> getImgByUserId(@PathVariable("userId") int userId){
    return service.getImgByUserId(userId);
  }

  @PostMapping("/save")
  public UserImgDTO save(@RequestBody UserImgDTO userImgDTO){
    return service.save(userImgDTO);
  }

  @DeleteMapping("/userId/{userId}")
  public Optional<UserImgDTO> deleteByUserId(@PathVariable("userId") int userId){
    return service.deleteByUserId(userId);
  }

  @PutMapping("/userId/{userId}")
  public Optional<UserImgDTO> updateByUserId(@PathVariable("userId") int userId, @RequestBody UserImgDTO userImgDTO){
    return service.updateByUserId(userId, userImgDTO);
  }
}
