package program.monsters;

public class Spider extends Monster {
    private Integer mana = 100;

    public Spider(String monsterName, Integer monsterHP, Integer monsterPower) {
        super(monsterName, monsterHP, monsterPower);
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Spider(Integer mana) {
        this.mana = mana;
    }

    public Spider() {
    }

    @Override
    public Integer useAttackSpell() {
        this.mana -= 25;

        Integer spiderPower = super.getMonsterPower();
        double damage = spiderPower * 1.5;
        spiderPower = (int) damage;
        return spiderPower;
    }

    @Override
    public void info() {
        System.out.println(" Мана: " + getMana());
    }

}
