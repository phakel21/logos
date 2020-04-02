package com.Rpg.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "players")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickName;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Hero> heroes;

    @Enumerated(EnumType.STRING)
    private Role role;
}
