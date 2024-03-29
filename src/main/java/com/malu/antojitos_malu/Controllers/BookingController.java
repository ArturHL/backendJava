package com.malu.antojitos_malu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malu.antojitos_malu.Domain.Services.BookingService;
import com.malu.antojitos_malu.Domain.DTO.BookingDTO;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class BookingController {
  @Autowired
  private BookingService service;

  @GetMapping("/all")
  public Optional<List<BookingDTO>> getAll(){
    return service.getAll();
  }

  @GetMapping("/{UserId}")
  public Optional<List<BookingDTO>> getByUserId(@PathVariable("UserId")int UserId){
    return service.getByUserId(UserId);
  }

  @PostMapping("/save")
  public BookingDTO save(@RequestBody BookingDTO bookingDTO){
    return service.save(bookingDTO);
  }

  @DeleteMapping("/{id}")
  public Optional<BookingDTO> deleteById(@PathVariable("id")int id){
    return service.deleteById(id);
  }

  @PutMapping("/{id}")
  public Optional<BookingDTO> updateById(@PathVariable("id")int id, @RequestBody BookingDTO bookingDTO){
    return service.updateById(id, bookingDTO);
  }

}
