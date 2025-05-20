package com.codewithishaan.blog.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithishaan.blog.entities.User;
import com.codewithishaan.blog.exceptions.ResourceNotFoundException;
import com.codewithishaan.blog.payloads.UserDto;
import com.codewithishaan.blog.repositories.UserRepo;
import com.codewithishaan.blog.services.UsersService;

@Service
public class UserServiceimpl implements UsersService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = dtoToUser(userDto);
        User savedUser = userRepo.save(user);
        return userToDto(savedUser);
    }

    @Override
    public UserDto update(UserDto userDto, Integer userId) {
        User user = userRepo.findById(userId)
             .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setContactNo(userDto.getContactNo());
        user.setModel(userDto.getModel());
        user.setColor(userDto.getColor());
        user.setShininess(userDto.getShininess());

        User updatedUser = userRepo.save(user);
        return userToDto(updatedUser);
    }

    @Override
    public UserDto getUserById(Integer userId) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
        return userToDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepo.findAll();
        return users.stream().map(this::userToDto).collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Integer userId) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
        userRepo.delete(user);
    }

    // Convert DTO to Entity
    private User dtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
    user.setColor(userDto.getColor());
    user.setContactNo(userDto.getContactNo());
    user.setModel(userDto.getModel());
    user.setShininess(userDto.getShininess());
        return user;
    }

    // Convert Entity to DTO
    private UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setModel(user.getModel());
        userDto.setContactNo(user.getContactNo());
        userDto.setColor(user.getColor());
        userDto.setShininess(userDto.getShininess());
        return userDto;
    }
}
