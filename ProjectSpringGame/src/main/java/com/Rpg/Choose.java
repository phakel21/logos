package com.Rpg;

import com.Rpg.entity.Hero;
import com.Rpg.entity.Location;
import com.Rpg.service.LocationService;
import com.Rpg.service.HeroService;

import java.util.List;

public class Choose {

    public void chooseLocation(LocationService locationService) {
        List<Location> locations = locationService.findAll();
        System.out.println("Виберіть локацію");
        for (Location location : locations) {
            locationService.info(location);
        }
    }

    public void chooseUser(HeroService heroService) {
        List<Hero> heroes = heroService.findAll();
        System.out.println("Виберіть персонажа");
        for (Hero hero : heroes) {
            heroService.info(hero);
        }
    }

}
