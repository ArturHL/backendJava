package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("/paymethod")
public class PayMethodController {
  @Autowired
  private PayMethodService service;

  @GetMapping("/all")
  public ResponseEntity<List<PayMethodDTO>> getAll(){
    return new ResponseEntity<>(service.getAll().get(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<PayMethodDTO> getPayMethodById(@PathVariable("id") int id){
    return service.getPayMethodById(id)
      .map(payMethodDTO -> new ResponseEntity<>(payMethodDTO, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping("/userId/{userId}")
  public ResponseEntity<List<PayMethodDTO>> getByUserId(@PathVariable("userId") int userId){
    return new ResponseEntity<>(service.getByUserId(userId).get(), HttpStatus.OK);
  }

  @PostMapping("/save")
  public ResponseEntity<PayMethodDTO> save(@RequestBody PayMethodDTO payMethodDTO){
    return new ResponseEntity<>(service.save(payMethodDTO), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<PayMethodDTO> deleteById(@PathVariable("id") int id){
    return service.deleteById(id)
      .map(payMethodDTO -> new ResponseEntity<>(payMethodDTO, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PutMapping("/{id}")
  public ResponseEntity<PayMethodDTO> updateById(@PathVariable("id") int id, @RequestBody PayMethodDTO payMethodDTO){
    return service.updateById(id, payMethodDTO)
      .map(payMethodDTO1 -> new ResponseEntity<>(payMethodDTO1, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
}
