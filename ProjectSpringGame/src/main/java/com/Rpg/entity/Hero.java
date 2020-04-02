package com.Rpg.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "nick_name")
    private String userName;

    @Column(name = "HP")
    private Integer userHP;

    @Column(name = "MP")
    private Integer userMP;

    @Column(name = "power")
    private Integer userPower;

    @Column(name = "armorHP")
    private Integer armorHP;

    @Column(name = "currentHP")
    private Integer currentHp;

    @ManyToOne
    private HeroClass heroClass;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private User user;


    @PrePersist
    public void onCreate(){
        this.currentHp = userHP;
    }

        public Hero() {
    }

    public Hero(Integer userId, String userName, Integer userHP, Integer userMP, Integer userPower, HeroClass heroClass) {
        this.userId = userId;
        this.userName = userName;
        this.userHP = userHP;
        this.userMP = userMP;
        this.userPower = userPower;
        this.heroClass = heroClass;
}

    @Override
    public String toString() {
        return "Hero{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userHP=" + userHP +
                ", userMP=" + userMP +
                ", userPower=" + userPower +
                ", currentHp=" + currentHp +
                ", HeroClass=" + heroClass +
                '}';
    }
}
