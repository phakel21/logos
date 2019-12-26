package program;

import program.monsters.Monster;
import program.person.Character;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Location  {
    private String name;

    private Map<Integer, Monster> monsterMap = new HashMap<>();

    private Integer modeMonsterHp = 0;
    private Integer modeMonsterPower = 0;
    private Integer modeCharacterHp = 0;
    private Integer modeCharacterPower = 0;

    public Location(String name, Map<Integer, Monster> monsterMap, Integer modeMonsterHp, Integer modeMonsterPower,
                    Integer modeCharacterHp, Integer modeCharacterPower) {
        this.name = name;
        this.monsterMap = monsterMap;
        this.modeMonsterHp = modeMonsterHp;
        this.modeMonsterPower = modeMonsterPower;
        this.modeCharacterHp = modeCharacterHp;
        this.modeCharacterPower = modeCharacterPower;
    }

    public Location() {
    }

    void locationFight(Character character) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> integersSet = this.monsterMap.keySet();
        for (Integer level : integersSet) {
            Monster monster = this.monsterMap.get(level);
            monsterMode(monster);
            characterMode(character);
            if (character.getCharacterHP() > 0)
                System.out.println("Ваш ворог - " + monster.getMonsterName() + " HP:" + monster.getMonsterHP());
            while (monster.getMonsterHP() > 0 && character.getCharacterHP() > 0) {
                character.choose();
                switch (scanner.nextInt()) {
                    case 1:
                        character.fight(monster);
                        break;
                    case 2:
                        if (character.getCharacterHP() < 100) {
                            character.heal(monster);
                            break;
                        }
                    case 3:
                        character.useFireBall(monster);
                        break;
                    case 4:
                        character.returnMana(monster);
                        break;
                    case 5:
                        File file = new File("text.txt");
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));
                        bufferedWriter.write("Ви пройшли - " + monster.getMonsterName());
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        break;
                }
                System.out.print("Monster HP: " + monster.getMonsterHP());
                monster.info();
                System.out.print("Character HP: " + character.getCharacterHP());
                character.info();
                System.out.println(" Armor:" + character.getArmorHp());
            }
            if (character.getCharacterHP() > 0)
                System.out.println("Ти виграв - " + monster.getMonsterName());
            System.out.println();
        }
    }

    Location(String name, Map<Integer, Monster> monsterMap) {
        this.name = name;
        this.monsterMap = monsterMap;
    }

    private void monsterMode(Monster monster) {
        monster.setMonsterHP(monster.getMonsterHP() + modeMonsterHp);
        monster.setMonsterPower(monster.getMonsterPower() + modeMonsterPower);
    }

    private void characterMode(Character character) {
        character.setCharacterHP(character.getCharacterHP() + modeCharacterHp);
        character.setCharacterPower(character.getCharacterPower() + modeCharacterPower);
    }
}
