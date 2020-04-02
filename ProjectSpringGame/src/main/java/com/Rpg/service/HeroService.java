package com.Rpg.service;

import com.Rpg.dto.MonsterDto;
import com.Rpg.dto.HeroDto;
import com.Rpg.entity.Hero;
import com.Rpg.entity.Monster;

import java.util.List;

public interface HeroService {

    Hero save(Hero hero);

    Hero getOne(Integer id);

    Hero getOneWithHeroBonus(Integer id);

    List<Hero> findAll();

    void deleteById(Integer id);

    void info(Hero hero);

    void heal(HeroDto heroDto);

    void choose();

    void show(MonsterDto monsterDto, HeroDto heroDto);

    void kick(Hero heroDto, Monster monsterDto);
}
