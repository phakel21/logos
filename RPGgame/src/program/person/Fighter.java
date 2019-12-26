package program.person;

import program.item.*;
import program.monsters.Monster;

public class Fighter extends Character {
    public Fighter(String characterName, Integer characterHP, Integer characterPower) {
        super(characterName, characterHP, characterPower);
    }

    public Fighter() {
    }

    @Override
    public void choose() {
        System.out.println("Введіть (1)вдарити або (2)хілитись");
    }

    @Override
    public void heal(Monster monster) {
        setCharacterHP(getCharacterHP() + 10);
        setCharacterHP(getCharacterHP()- monster.getMonsterPower());
    }
    @Override
    public void getArmorHealth() {
        Armor armor1 = new Helmet("Шлем", 5);
        Armor armor2 = new Chestplate("Нагрудник", 10);
        Armor armor3 = new Pants("Штани", 7);
        Armor armor4 = new Boots("Черевики", 6);
        super.armorHp = armor1.getArmor() + armor2.getArmor() + armor3.getArmor() + armor4.getArmor();
    }
}
