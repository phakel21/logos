package com.Rpg.service;

import com.Rpg.dto.HeroDto;
import com.Rpg.dto.LocationDto;
import com.Rpg.entity.Location;

import java.util.List;

public interface LocationService {

    Location save(Location location);

    Location getOne(Integer id);

    List<Location> findAll();

    void deleteById(Integer id);

    void locationFight(LocationDto locationDto, HeroDto heroDto, HeroService heroService);

    void info(Location location);

}
