package com.Rpg;

import com.Rpg.entity.Hero;
import com.Rpg.service.HeroClassService;
import com.Rpg.service.HeroService;
import com.Rpg.service.LocationService;
import com.Rpg.service.MonsterService;
import com.Rpg.setting.HeroClassSetting;
import com.Rpg.setting.LocationSetting;
import com.Rpg.setting.MonsterSetting;
import com.Rpg.setting.UserSetting;

import java.util.List;
import java.util.Scanner;

public class SettingMenu {

    public void settings(Scanner scanner, HeroService heroService, HeroClassService heroClassService, LocationService locationService, MonsterService monsterService) {

        Boolean settings = true;
        do {
            System.out.println("(1)Подивитись всіх персонажів");
            System.out.println("(2)Настройки гравця");
            System.out.println("(3)Добавити героя");
            System.out.println("(4)Добавити локацію");
            System.out.println("(5)Добавити монстра");
            System.out.println("(6)Вихід в головне меню");
            Integer settingsChoose = scanner.nextInt();
            switch (settingsChoose) {
                case 1:
                    List<Hero> heroes = heroService.findAll();
                    for (Hero hero : heroes) {
                        System.out.println(hero.toString());
                    }
                    break;
                case 2:
                    System.out.println("(1)Добавити гравця");
                    System.out.println("(2)Видалити гравця");
                    UserSetting userSetting = new UserSetting();
                    switch (scanner.nextInt()) {
                        case 1:
                            userSetting.createUser(scanner, heroService, heroClassService);
                            break;
                        case 2:
                            userSetting.deleteUser(scanner, heroService);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("(1)Добавити героя");
                    System.out.println("(2)Видалити героя");
                    HeroClassSetting heroClassSetting = new HeroClassSetting();
                    switch (scanner.nextInt()) {
                        case 1:
                            heroClassSetting.createHeroClass(scanner, heroClassService);
                            break;
                        case 2:
                            heroClassSetting.deleteHeroClass(scanner, heroClassService);
                            break;

                    }
                    break;
                case 4:
                    System.out.println("(1)Добавити локацію");
                    System.out.println("(2)Видалити локацію");
                    LocationSetting locationSetting = new LocationSetting();
                    switch (scanner.nextInt()) {
                        case 1:
                            locationSetting.createLocation(scanner, locationService);
                            break;
                        case 2:
                            locationSetting.deleteLocation(scanner, locationService);
                            break;

                    }
                    break;
                case 5:
                    System.out.println("(1)Добавити монстра");
                    System.out.println("(2)Видалити монстра");
                    MonsterSetting monsterSetting = new MonsterSetting();
                    switch (scanner.nextInt()) {
                        case 1:
                            monsterSetting.createMonster(scanner, monsterService, locationService);
                        case 2:
                            monsterSetting.deleteMonster(scanner, monsterService);
                    }
                    break;
                case 6:
                    settings = false;
                    break;
            }
        } while (settings);

    }
}
