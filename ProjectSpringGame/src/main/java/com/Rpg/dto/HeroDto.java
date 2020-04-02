package com.Rpg.dto;

import com.Rpg.entity.Hero;
import lombok.Data;

@Data
public class HeroDto {

    private Integer userId;

    private String name;

    private Integer userHP;

    private Integer userMP;

    private Integer userPower;

    private HeroClassDto heroClass;

    private Integer currentHp;

    public HeroDto(Hero hero) {
        this.userId = hero.getUserId();
        this.name = hero.getUserName();
        this.userHP = hero.getUserHP();
        this.userMP = hero.getUserMP();
        this.userPower = hero.getUserPower();
        this.heroClass = new HeroClassDto(hero.getHeroClass());
        this.currentHp = hero.getCurrentHp();
    }

}
