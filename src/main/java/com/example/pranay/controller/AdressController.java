package com.example.pranay.controller;

import com.example.pranay.entity.Address;
import com.example.pranay.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdressController {
  @Autowired
  private AddressService addressService;
  @GetMapping("/getAllAddress")
  public List<Address> getAll(){
      return addressService.getAllAddress();
  }
  @PostMapping("/saveAddress")
    public String saveAdd(@RequestBody Address address){
      return addressService.saveAddress(address);
  }

}
