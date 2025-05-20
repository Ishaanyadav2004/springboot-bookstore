package com.codewithishaan.blog.services;

import java.util.List;
import com.codewithishaan.blog.entities.User;
import com.codewithishaan.blog.payloads.UserDto;

public interface UsersService {
	
	//creating methods
    UserDto createUser(UserDto user);
    UserDto update(UserDto user, Integer userID);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId); 
}
