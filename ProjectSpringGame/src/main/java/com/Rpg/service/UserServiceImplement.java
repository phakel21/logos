package com.Rpg.service;

import com.Rpg.dto.UserDto;
import com.Rpg.entity.Role;
import com.Rpg.entity.User;
import com.Rpg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;

@Service("userDetailsService")
public class UserServiceImplement implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User registration(UserDto userDto) {
        if(!registrationValidation(userDto));

        User user = new User();
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setNickName(userDto.getLogin());
        user.setRole(Role.USER);
        return save(user);
    }

    @Override
    public User getOne(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{
        User byUserName = userRepository.findByNickName(s);
        ArrayList<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        simpleGrantedAuthorities.add(new SimpleGrantedAuthority(byUserName.getRole().toString()));
        return new org.springframework.security.core.userdetails.User(
                byUserName.getNickName(),
                byUserName.getPassword(),
                simpleGrantedAuthorities
        );
    }

    private Boolean registrationValidation(UserDto userDto){
        if(!userDto.getPassword().equals(userDto.getPasswordRepeat())) return false;
        if(userRepository.countByNickName(userDto.getLogin()) > 0) return false;
        return true;
    }
}
