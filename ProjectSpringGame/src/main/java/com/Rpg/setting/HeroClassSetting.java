package com.Rpg.setting;

import com.Rpg.entity.HeroClass;
import com.Rpg.service.HeroClassService;

import java.util.Scanner;

public class HeroClassSetting {

    public void createHeroClass(Scanner scanner, HeroClassService heroClassService) {
        HeroClass heroClass1 = new HeroClass();
        System.out.println("Введіть назву героя");
        heroClass1.setHeroName(scanner.next());
        System.out.println("Введіть HP");
        heroClass1.setHeroHp(scanner.nextInt());
        System.out.println("Введіть MP");
        heroClass1.setHeroMp(scanner.nextInt());
        heroClassService.save(heroClass1);
    }

    public void deleteHeroClass(Scanner scanner, HeroClassService heroClassService) {
        System.out.println("Введіть id героя");
        heroClassService.deleteById(scanner.nextInt());
    }
}
