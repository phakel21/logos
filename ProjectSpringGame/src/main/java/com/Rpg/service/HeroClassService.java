package com.Rpg.service;

import com.Rpg.entity.HeroClass;

import java.util.List;

public interface HeroClassService {

    HeroClass save(HeroClass heroClass);

    HeroClass getOne(Integer id);

    List<HeroClass> findAll();

    void deleteById(Integer id);

}