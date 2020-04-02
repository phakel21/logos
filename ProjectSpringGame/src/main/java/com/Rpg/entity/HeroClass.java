package com.Rpg.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "hero_class")
public class HeroClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hero_id")
    private Integer heroId;

    @Column(name = "name")
    private String heroName;

    @Column(name = "bonus_hp")
    private Integer heroHp;

    @Column(name = "bonus_mp")
    private Integer heroMp;

    @OneToMany(mappedBy = "heroClass",cascade=CascadeType.ALL)
    private List<Hero> heroes;

    public HeroClass() {
    }

    @Override
    public String toString() {
        return "HeroClass{" +
                "HeroId=" + heroId +
                ", HeroName='" + heroName + '\'' +
                ", HeroHp=" + heroHp +
                ", HeroMp=" + heroMp +
                '}';
    }
}
