package com.example.pranay.service;

import com.example.pranay.entity.Address;
import com.example.pranay.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddress(){
        return (List<Address>) addressRepository.findAll();
    }
    public String saveAddress(Address address){
        Long aid=address.getAid();
        Optional<Address> x=addressRepository.findById(aid);

        if(x.isPresent()){
            return "Failed";
        }
        addressRepository.save(address);
        return "success";
    }
}
