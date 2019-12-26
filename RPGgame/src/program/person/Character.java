package program.person;

import program.monsters.Monster;
import java.util.Random;

public class Character implements Person {
    private String characterName;
    private Integer characterHP;
    private Integer characterPower;
    Integer armorHp;

    public Character(String characterName, Integer characterHP, Integer characterPower) {
        this.characterName = characterName;
        this.characterHP = characterHP;
        this.characterPower = characterPower;
    }

    public Character() {

    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Integer getCharacterHP() {
        return characterHP;
    }

    public void setCharacterHP(Integer characterHP) {
        this.characterHP = characterHP;
    }

    public Integer getCharacterPower() {
        return characterPower;
    }

    public void setCharacterPower(Integer characterPower) {
        this.characterPower = characterPower;
    }

    public void setArmorHp(Integer armorHp) {
        this.armorHp = armorHp;
    }

    public Integer getArmorHp() {
        return armorHp;
    }

    public void fight(Monster monster) {

        Random random = new Random();
        int randomSpell = random.nextInt(100);
        int randomReg = random.nextInt(100);
        Integer spellPower = null;
        if (randomSpell < 16) {
            System.out.println("Use spell");
            spellPower = monster.useAttackSpell();
        }
        Integer monsterPower = monster.getMonsterPower();
        if (spellPower != null) {
            monsterPower = spellPower;
        }

        Integer spellHp = null;
        if (randomReg > 50 && randomReg < 65) {
            System.out.println("Regeneration");
            spellHp = monster.regeneration();
        }
        Integer monsterHp = monster.getMonsterHP();
        if (spellHp != null) {
            monsterHp = spellHp;
        }

        if (this.armorHp > 0) {
            armorHp -= monsterPower;
            Integer monsterHealth = monsterHp;
            monsterHealth -= this.characterPower;
            monster.setMonsterHP(monsterHealth);
        } else if (armorHp <= 0) {
            armorHp = 0;
            this.characterHP -= monsterPower;
            Integer monsterHealth = monsterHp;
            monsterHealth -= this.characterPower;
            monster.setMonsterHP(monsterHealth);
        }

    }

    public void heal(Monster monster) {
        this.characterHP += 20;
    }

    public void useFireBall(Monster monster) {
    }

    public void getArmorHealth() {
    }

    public void info() {
    }

    public void returnMana(Monster monster){}

    public void choose(){}
}
