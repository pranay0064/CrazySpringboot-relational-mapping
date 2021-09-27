package com.example.pranay.service;

import com.example.pranay.api.UserClientRequest;
import com.example.pranay.entity.Address;
import com.example.pranay.entity.User;
import com.example.pranay.repository.AddressRepository;
import com.example.pranay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
    public String saveUses(User user){
        Long aid=user.getUid();
        Optional<User> x=userRepository.findById(aid);

        if(x.isPresent()){
            return "Failed";
        }
        userRepository.save(user);
        return "success";
    }

    public String saveUserById(UserClientRequest userClientRequest) {
        Long aid=userClientRequest.getAid();
        Optional<Address> address=addressRepository.findById(aid);
        if(address.isPresent()){
            User u=new User();
            u.setAddress(address.get());
            u.setUid(userClientRequest.getUid());
            u.setUserName(userClientRequest.getUserName());
            userRepository.save(u);
            return "Success Boy";
        }
        return "failed";
    }
}
