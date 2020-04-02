package com.Rpg;

import com.Rpg.dto.HeroDto;
import com.Rpg.dto.LocationDto;
import com.Rpg.entity.Location;
import com.Rpg.entity.Hero;
import com.Rpg.service.HeroService;
import com.Rpg.service.LocationService;

import java.util.Scanner;

public class GameMenu {
    private Choose choose = new Choose();

    public void playGame(Scanner scanner, HeroService heroService, LocationService locationService) {
        choose.chooseUser(heroService);
        Hero hero = heroService.getOneWithHeroBonus(scanner.nextInt());
        HeroDto heroDto = new HeroDto(hero);

        choose.chooseLocation(locationService);
        Location location = locationService.getOne(scanner.nextInt());
        LocationDto locationDto = new LocationDto(location);

        locationService.locationFight(locationDto, heroDto, heroService);
    }

}