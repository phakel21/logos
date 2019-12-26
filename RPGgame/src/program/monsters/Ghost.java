package program.monsters;

public class Ghost extends Monster {
    public Ghost(String monsterName, Integer monsterHP, Integer monsterPower) {
        super(monsterName, monsterHP, monsterPower);
    }

    public Ghost() {
    }

    @Override
    public Integer regeneration() {
        Integer ghostHp = super.getMonsterHP();
        double reg = ghostHp + 10;
        ghostHp = (int) reg;
        return ghostHp;
    }
}
