package com.Rpg.dto;

import lombok.Data;

@Data
public class UserDto {

    private Integer id;
    private String login;
    private String password;
    private String passwordRepeat;
    private String role;
    private HeroDto heroDto;

    public UserDto() {
    }

    public UserDto(String login, String password){
        this.login = login;
        this.password = password;

    }
    public UserDto(Integer id, String login, String password, String passwordRepeat, String role, HeroDto heroDto) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.passwordRepeat = passwordRepeat;
        this.role = role;
        this.heroDto = heroDto;
    }
}
