package com.Rpg.setting;

import com.Rpg.entity.Location;
import com.Rpg.entity.Monster;
import com.Rpg.service.LocationService;
import com.Rpg.service.MonsterService;

import java.util.List;
import java.util.Scanner;

public class MonsterSetting {

    public void createMonster(Scanner scanner, MonsterService monsterService, LocationService locationService){
        Monster monster = new Monster();
        System.out.println("Введіть назву монстра");
        monster.setMonsterName(scanner.next());
        System.out.println("Введіть HP");
        monster.setMonsterHP(scanner.nextInt());
        System.out.println("Введіть MP");
        monster.setMonsterMP(scanner.nextInt());
        System.out.println("Введіть power");
        monster.setMonsterPower(scanner.nextInt());
        monster.setCurrentHp(0);
        System.out.println("Виберіть локацію для монстра");
        List<Location> locations = locationService.findAll();
        for (Location location : locations) {
            locationService.info(location);
        }
        Location location = locationService.getOne(scanner.nextInt());
        monster.setLocation(location);
        monsterService.save(monster);
    }

    public void deleteMonster(Scanner scanner, MonsterService monsterService){
        System.out.println("Введіть id монстра");
        monsterService.deleteById(scanner.nextInt());
    }
}
