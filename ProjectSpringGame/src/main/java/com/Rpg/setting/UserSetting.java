package com.Rpg.setting;

import com.Rpg.entity.Hero;
import com.Rpg.entity.HeroClass;
import com.Rpg.service.HeroClassService;
import com.Rpg.service.HeroService;

import java.util.List;
import java.util.Scanner;

public class UserSetting {

    public void createUser (Scanner scanner, HeroService heroService, HeroClassService heroClassService){
        Hero hero = new Hero();
        System.out.println("Введіть никнейм: ");
        hero.setUserName(scanner.next());
        System.out.println("Введіть HP:");
        hero.setUserHP(scanner.nextInt());
        System.out.println("Введіть MP:");
        hero.setUserMP(scanner.nextInt());
        System.out.println("Введіть power:");
        hero.setUserPower(scanner.nextInt());
        hero.setCurrentHp(0);
        hero.setArmorHP(0);
        System.out.println("Виберіть расу");
        List<HeroClass> heroClasses = heroClassService.findAll();
        for (HeroClass heroClass : heroClasses) {
            System.out.println(heroClass.toString());
        }
        HeroClass heroClass = heroClassService.getOne(scanner.nextInt());
        hero.setHeroClass(heroClass);
        heroService.save(hero);
    }

    public void deleteUser(Scanner scanner, HeroService heroService){
        System.out.println("Введіть id гравця");
        heroService.deleteById(scanner.nextInt());
    }
}
