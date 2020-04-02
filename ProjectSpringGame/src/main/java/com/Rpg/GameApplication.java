package com.Rpg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GameApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GameApplication.class, args);

//        HeroService heroService = (HeroService) run.getBean("heroServiceImplement");
//        HeroClassService heroClassService = (HeroClassService) run.getBean("heroClassServiceImplement");
//        LocationService locationService = (LocationService) run.getBean("locationServiceImplement");
//        MonsterService monsterService = (MonsterService) run.getBean("monsterServiceImplement");
//        UserService userService = (UserService) run.getBean("userServiceImplement");

//
//        MainMenu mainMenu = new MainMenu();
//        mainMenu.main(userService, heroClassService, locationService, monsterService);

    }
}


