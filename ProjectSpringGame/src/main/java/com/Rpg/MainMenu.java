package com.Rpg;

import com.Rpg.service.HeroClassService;
import com.Rpg.service.HeroService;
import com.Rpg.service.LocationService;
import com.Rpg.service.MonsterService;

import java.util.Scanner;

public class MainMenu {

    public void main(HeroService heroService, HeroClassService heroClassService, LocationService locationService, MonsterService monsterService) {
        Scanner scanner = new Scanner(System.in);
        Boolean mainChoose = true;
        do {
            System.out.println("Вітаю  вас у грі");
            System.out.println("(1)Грати");
            System.out.println("(2)Настройки");
            System.out.println("(3)Вихід");
            switch (scanner.nextInt()) {
                case 1:
                    GameMenu gameMenu = new GameMenu();
                    gameMenu.playGame(scanner, heroService, locationService);
                    break;
                case 2:
                    SettingMenu settingMenu = new SettingMenu();
                    settingMenu.settings(scanner, heroService, heroClassService, locationService, monsterService);
                    break;
                case 3:
                    mainChoose = false;
                    break;
            }
        } while (mainChoose);
    }
}
