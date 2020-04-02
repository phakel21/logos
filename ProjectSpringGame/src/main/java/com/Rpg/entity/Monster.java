package com.Rpg.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "monster_class")
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "monster_id")
    private Integer monsterId;

    @Column(name = "name", nullable = false)
    private String monsterName;

    @Column(name = "HP", nullable = false)
    private Integer monsterHP;

    @Column(name = "MP", nullable = false)
    private Integer monsterMP;

    @Column(name = "power",nullable = false)
    private Integer monsterPower;

//    @Column(name = "currentHP")
    private Integer currentHp;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;


    @PrePersist
    public void onCreate(){
        this.currentHp = monsterHP;
    }

    public Monster() {
    }

    public String toString() {
        return "Monster{" +
                "monsterId=" + monsterId +
                ", monsterName='" + monsterName + '\'' +
                ", monsterHP=" + monsterHP +
                ", monsterMP=" + monsterMP +
                ", monsterPower=" + monsterPower +
                ", currentHp=" + currentHp +
                '}';
    }
}
