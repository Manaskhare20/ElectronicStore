package com.electronic.store.ElectronicStore.services;

import com.electronic.store.ElectronicStore.dtos.PageableResponse;
import com.electronic.store.ElectronicStore.dtos.UserDto;
import com.electronic.store.ElectronicStore.entities.User;

import java.util.List;

public interface UserService {

    //create

    UserDto createUser(UserDto userDto);

    //update

    UserDto updateUser(UserDto userDto,String userId);

    //delete

    void deleteUser(String userId);

    //get all users

    PageableResponse<UserDto> getAllUser(int pageNumber, int pageSize, String sortBy, String sortDir);

    //get single user by id
    UserDto getUserById(String userId);

    //get signle user by email
    UserDto getUserByEmail(String email);

    //search user

    List<UserDto>searchUser(String keyword);

}
