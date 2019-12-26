package program.person;

import program.monsters.Monster;

public interface Person {

    void fight(Monster monster);

    void heal(Monster monster);

    void getArmorHealth();

    void useFireBall(Monster monster);

    void info();

}
