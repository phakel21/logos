package com.Rpg.dto;

import com.Rpg.entity.HeroClass;

public class HeroClassDto {

    private Integer heroId;

    private String heroName;

    private Integer heroHp;

    private Integer heroMp;


    public HeroClassDto(HeroClass heroClass) {
        this.heroId = heroClass.getHeroId();
        this.heroName = heroClass.getHeroName();
        this.heroHp = heroClass.getHeroHp();
        this.heroMp = heroClass.getHeroMp();
    }
}
