package com.codewithishaan.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.codewithishaan.blog.services.UsersService;
import com.codewithishaan.blog.payloads.UserDto;
import com.codewithishaan.blog.payloads.ApiResponse;

import java.util.List;


@CrossOrigin("http://localhost:3000")  
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UsersService usersService;

    // POST 
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createdUserDto = this.usersService.createUser(userDto);
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }

    // PUT
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> update(@RequestBody UserDto userDto, @PathVariable("userId") Integer userId) {
        UserDto updatedUser = this.usersService.update(userDto, userId);
        return ResponseEntity.ok(updatedUser);
    }

    // DELETE - delete user
    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid) {
        this.usersService.deleteUser(uid);
        return new ResponseEntity<>(new ApiResponse("User deleted Successfully", true), HttpStatus.OK);

    }

    // GET 
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUser() {
        return ResponseEntity.ok(this.usersService.getAllUsers());
    }

    // GET 
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable("userId") Integer userId) {
        return ResponseEntity.ok(this.usersService.getUserById(userId));
    }
}
