package com.Rpg.service;

import com.Rpg.dto.HeroDto;
import com.Rpg.dto.LocationDto;
import com.Rpg.entity.Location;
import com.Rpg.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LocationServiceImplement implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location save(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location getOne(Integer id) {
        return locationRepository.getOne(id);
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        locationRepository.deleteById(id);
    }

    @Override
    public void locationFight(LocationDto locationDto, HeroDto heroDto, HeroService heroService) {
//        Scanner scanner = new Scanner(System.in);
//        for (MonsterDto monsterDto : locationDto.getMonsters()) {
//            heroService.show(monsterDto, heroDto);
//            Boolean a = true;
//            while (monsterDto.getMonsterHP() >= 0 && heroDto.getUserHP() > 0 && a) {
//                heroService.choose();
//                switch (scanner.nextInt()) {
//                    case 1:
//                        heroService.kick(user, monsterDto);
//                        heroService.show(monsterDto, heroDto);
//                        if (heroDto.getUserHP() <= 0)
//                            System.out.println("I kill you " + monsterDto.getMonsterName());
//                        break;
//                    case 2:
//                        if (heroDto.getUserHP() < 100) {
//                            heroService.heal(heroDto);
//                            heroService.show(monsterDto, heroDto);
//                            break;
//                        } else {
//                            System.out.println("Ви не можете збільшувати HP");
//                            break;
//                        }
//                    case 3:
//                        a = false;
//                        break;
//
//                }
//            }

//        }
    }

    @Override
    public void info(Location location) {
        System.out.println("LocationId: " + +location.getLocationId() +
                " | Name: '" + location.getName());
    }
}

