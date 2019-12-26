package program;

import program.monsters.Ghost;
import program.monsters.Monster;
import program.monsters.Spider;
import program.monsters.Wolf;
import program.person.Fighter;
import program.person.Witcher;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Fighter fighter = new Fighter("Steve", 100, 10);
        Witcher witcher = new Witcher("Merlin", 70, 10, 20, 100);

        Monster spiderMonsterLvl1 = new Spider("Spider 1", 20, 5);
        Monster spiderMonsterLvl2 = new Spider("Spider 2", 30, 6);
        Monster spiderMonsterLvl3 = new Spider("Spider 3", 40, 7);
        Monster spiderBoss = new Spider("Spider Boss", 50, 8);

        Monster ghostMonsterLvl1 = new Ghost("Ghost 1", 25, 6);
        Monster ghostMonsterLvl2 = new Ghost("Ghost 2", 35, 7);
        Monster ghostMonsterLvl3 = new Ghost("Ghost 3", 45, 8);
        Monster ghostBoss = new Ghost("Ghost Boss", 55, 9);

        Monster wolfMonsterLvl1 = new Wolf("Wolf 1", 30, 8);
        Monster wolfMonsterLvl2 = new Wolf("Wolf 2", 45, 9);
        Monster wolfMonsterLvl3 = new Wolf("Wolf 3", 60, 10);
        Monster wolfBoss = new Wolf("Wolf Boss", 75, 12);

        Map<Integer, Monster> locationSpiderMonsters = new HashMap<>();

        locationSpiderMonsters.put(1, spiderMonsterLvl1);
        locationSpiderMonsters.put(2, spiderMonsterLvl2);
        locationSpiderMonsters.put(3, spiderMonsterLvl3);
        locationSpiderMonsters.put(4, spiderBoss);

        Map<Integer, Monster> locationGhostMonsters = new HashMap<>();

        locationGhostMonsters.put(1, ghostMonsterLvl1);
        locationGhostMonsters.put(2, ghostMonsterLvl2);
        locationGhostMonsters.put(3, ghostMonsterLvl3);
        locationGhostMonsters.put(4, ghostBoss);

        Map<Integer, Monster> locationWolfMonsters = new HashMap<>();

        locationWolfMonsters.put(1, wolfMonsterLvl1);
        locationWolfMonsters.put(2, wolfMonsterLvl2);
        locationWolfMonsters.put(3, wolfMonsterLvl3);
        locationWolfMonsters.put(4, wolfBoss);


        Location spiderLocation = new Location("Forest", locationSpiderMonsters);
        Location ghostLocation = new Location("Century", locationGhostMonsters);
        Location wolfLocation = new Location("Mountain", locationWolfMonsters);


        System.out.println("Вітаю  вас у грі");
        System.out.println("Виберіть персонажа");
        System.out.println("(1)Маг або (2)бієць");
        switch (scanner.nextInt()) {
            case 1:
                witcher.getArmorHealth();
                spiderLocation.locationFight(witcher);
                ghostLocation.locationFight(witcher);
                wolfLocation.locationFight(witcher);
                break;
            case 2:
                fighter.getArmorHealth();
                spiderLocation.locationFight(fighter);
                ghostLocation.locationFight(fighter);
                wolfLocation.locationFight(fighter);
        }

    }
}
