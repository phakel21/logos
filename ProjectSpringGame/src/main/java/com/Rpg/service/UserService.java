package com.Rpg.service;

import com.Rpg.dto.UserDto;
import com.Rpg.entity.User;

public interface UserService {

    User save(User user);

    User registration (UserDto userDto);

    User getOne(Long id);
}
