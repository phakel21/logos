package program.person;

import program.item.*;
import program.monsters.Monster;

public class Witcher extends Character {
    private Integer mana = 0;
    private Integer fireBall;

    public Witcher() {
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getFireBall() {
        return fireBall;
    }

    public void setFireBall(Integer fireBall) {
        this.fireBall = fireBall;
    }

    public Witcher(String characterName, Integer characterHP, Integer characterPower, Integer fireBall, Integer mana) {
        super(characterName, characterHP, characterPower);
        this.fireBall = fireBall;
        this.mana = mana;
    }

    @Override
    public void heal(Monster monster) {
        if (mana > 0 && getCharacterHP() < 70) {
            setCharacterHP(getCharacterHP() + 10);
            this.mana -= 20;
            if (getCharacterHP() > 70) setCharacterHP(70);
        } else if (getCharacterHP() == 70) {
            System.out.println("Життя на максимумі");
        } else System.out.println("Закінчилась мана");
    }

    @Override
    public void useFireBall(Monster monster) {
        if (getMana() <= 0) {
            fireBall = 0;
            System.out.println("Закінчилась мана");
        } else {
            Integer charHp = getCharacterHP();
            super.setCharacterHP(charHp -= monster.getMonsterPower());
            Integer monsterHPP = monster.getMonsterHP();
            monsterHPP -= fireBall;
            monster.setMonsterHP(monsterHPP);
            mana -= 25;
        }
    }

    @Override
    public void info() {
        System.out.print(" Мана: " + getMana());
    }

    @Override
    public void returnMana(Monster monster) {
        Integer charHp = getCharacterHP();
        super.setCharacterHP(charHp -= monster.getMonsterPower());
        setMana(getMana() + 5);
    }

    @Override
    public void choose() {
        System.out.println("Введіть (1)вдарити або (2)хілитись або FireBall(3) або (4)поповнити ману на 5");
    }

    @Override
    public void getArmorHealth() {
        Armor armor1 = new Helmet("Шлем", 4);
        Armor armor2 = new Chestplate("Нагрудник", 7);
        Armor armor3 = new Pants("Штани", 5);
        Armor armor4 = new Boots("Черевики", 4);
        super.armorHp = armor1.getArmor() + armor2.getArmor() + armor3.getArmor() + armor4.getArmor();
    }
}
