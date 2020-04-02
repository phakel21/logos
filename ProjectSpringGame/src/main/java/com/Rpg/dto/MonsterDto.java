package com.Rpg.dto;

import com.Rpg.entity.Monster;

public class MonsterDto {

    private Integer monsterId;

    private String monsterName;

    private Integer monsterHP;

    private Integer monsterMP;

    private Integer monsterPower;

    private Integer currentHp;

    public MonsterDto(Monster monster) {
        this.monsterId = monster.getMonsterId();
        this.monsterName = monster.getMonsterName();
        this.monsterHP = monster.getMonsterHP();
        this.monsterMP = monster.getMonsterMP();
        this.monsterPower = monster.getMonsterPower();
        this.currentHp = monster.getCurrentHp();
    }

    public MonsterDto() {
    }


    public Integer getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Integer monsterId) {
        this.monsterId = monsterId;
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

    public Integer getMonsterMP() {
        return monsterMP;
    }

    public void setMonsterMP(Integer monsterMP) {
        this.monsterMP = monsterMP;
    }

    public Integer getMonsterPower() {
        return monsterPower;
    }

    public void setMonsterPower(Integer monsterPower) {
        this.monsterPower = monsterPower;
    }

    public Integer getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(Integer currentHp) {
        this.currentHp = currentHp;
    }
}
