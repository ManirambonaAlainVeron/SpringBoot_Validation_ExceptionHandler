package com.example.validation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.validation.dto.UserDto;
import com.example.validation.entities.UserEntity;
import com.example.validation.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserDto userDto) {
        UserEntity user = new UserEntity(userDto.getName(), userDto.getEmail(), userDto.getMobile(),
                userDto.getGender(), userDto.getAge(), userDto.getNationality());

        return userRepository.save(user);
    }

    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    public UserEntity getUserById(Integer id) {
        UserEntity userEntity = userRepository.findById(id).get();
        return userEntity;
    }
}
