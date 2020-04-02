package com.Rpg.service;

import com.Rpg.dto.HeroDto;
import com.Rpg.dto.MonsterDto;
import com.Rpg.entity.Hero;
import com.Rpg.entity.Monster;
import com.Rpg.entity.HeroClass;
import com.Rpg.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImplement implements HeroService {

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private MonsterService monsterService;

    @Override
    public Hero getOne(Integer id) {
        return heroRepository.getOne(id);
    }

    @Override
    public Hero save(Hero hero) {
        return heroRepository.save(hero);
    }

    public Hero getOneWithHeroBonus(Integer id) {
        Hero hero = heroRepository.getOne(id);
        addToHero(hero);
        return hero;

    }

    @Override
    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        heroRepository.deleteById(id);
    }

    @Override
    public void info(Hero hero) {
        addToHero(hero);
        System.out.println("UserId: " + +hero.getUserId() +
                " | Name: '" + hero.getUserName() + '\'' +
                " | HP: " + hero.getUserHP() +
                " | MP: " + hero.getUserMP() +
                " | Power: " + hero.getUserPower() +
                " | HeroClass: " + hero.getHeroClass().toString());
    }

    @Override
    public void heal(HeroDto heroDto) {
        if (heroDto.getUserMP() > 0) {
            heroDto.setUserHP(heroDto.getUserHP() + 10);
            heroDto.setUserMP(heroDto.getUserMP() - 20);
        }
    }

    public void kick(Hero hero, Monster monster) {

        if(monster.getCurrentHp() > 0 || hero.getCurrentHp() > 0 ){
            hero.setCurrentHp(hero.getCurrentHp()-monster.getMonsterPower());
            monster.setCurrentHp(monster.getCurrentHp()- hero.getUserPower());
        }

//        Integer heroPower = hero.getUserPower();
//        Integer monsterPower = monster.getMonsterPower();
//        monster.setMonsterHP(monster.getMonsterHP() - heroPower);
//        if (monster.getMonsterHP() > 0) {
//            hero.setUserHP(hero.getUserHP() - monsterPower);
//        }
        save(hero);
        monsterService.save(monster);

    }

    private void addToHero(Hero hero) {
        HeroClass heroClass = hero.getHeroClass();
        hero.setUserHP(hero.getUserHP() + heroClass.getHeroHp());
        hero.setUserMP(hero.getUserMP() + heroClass.getHeroMp());
    }

    public void show(MonsterDto monsterDto, HeroDto heroDto) {
        System.out.println("----------------------------");
        System.out.println("Monster");
        System.out.println("Name: " + monsterDto.getMonsterName());
        System.out.println("HP: " + monsterDto.getMonsterHP());
        System.out.println("MP: " + monsterDto.getMonsterMP());
        System.out.println("Power: " + monsterDto.getMonsterPower());
        System.out.println();
        System.out.println("Character");
        System.out.println("Name: " + heroDto.getName());
        System.out.println("HP: " + heroDto.getUserHP());
        System.out.println("MP: " + heroDto.getUserMP());
        System.out.println("Power: " + heroDto.getUserPower());
        System.out.println("----------------------------");
        System.out.println();

    }

    @Override
    public void choose() {
        System.out.println("Введіть: ");
        System.out.println("(1)Вдарити");
        System.out.println("(2)Хілитиь ");
        System.out.println("(3)Вийти ");
    }
}
