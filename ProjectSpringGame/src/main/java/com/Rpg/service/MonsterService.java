package com.Rpg.service;

import com.Rpg.entity.Monster;

import java.util.List;

public interface MonsterService {

    Monster save(Monster monster);

    Monster getOne(Integer id);

    List<Monster> findAll();

    void deleteById(Integer id);

    void info(Monster monster);
}
