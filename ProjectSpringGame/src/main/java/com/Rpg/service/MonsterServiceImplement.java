package com.Rpg.service;

import com.Rpg.entity.Monster;
import com.Rpg.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterServiceImplement implements MonsterService {

    @Autowired
    private MonsterRepository monsterRepository;

    @Override
    public Monster save(Monster monster) {
        return monsterRepository.save(monster);
    }

    @Override
    public Monster getOne(Integer id) {
        return monsterRepository.getOne(id);
    }

    @Override
    public List<Monster> findAll() {
        return monsterRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        monsterRepository.deleteById(id);
    }

    public void info(Monster monster) {
        System.out.println("Monster");
        System.out.println("Name: " + monster.getMonsterName());
        System.out.println("HP: " + monster.getMonsterHP());
        System.out.println("Power: " + monster.getMonsterPower());
        System.out.println("MP: " + monster.getMonsterMP());
    }

}


