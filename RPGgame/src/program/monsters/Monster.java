package program.monsters;

public class Monster {
    private String monsterName;
    private Integer monsterHP;
    private Integer monsterPower;

    public Monster(String monsterName, Integer monsterHP, Integer monsterPower) {
        this.monsterName = monsterName;
        this.monsterHP = monsterHP;
        this.monsterPower = monsterPower;
    }

    public Monster() {
    }

    public String getMonsterName() {
        return monsterName;
    }
    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }
    public Integer getMonsterHP() {
        return monsterHP;
    }
    public void setMonsterHP(Integer monsterHP) {
        this.monsterHP = monsterHP;
    }
    public Integer getMonsterPower() {
        return monsterPower;
    }
    public void setMonsterPower(Integer monsterPower) {
        this.monsterPower = monsterPower;
    }

    public Integer useAttackSpell(){
        return null;
    }
    public Integer regeneration(){return null;}
    public void info(){}
}
