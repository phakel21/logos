package com.Rpg.service;

import com.Rpg.entity.HeroClass;
import com.Rpg.repository.HeroClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroClassServiceImplement implements HeroClassService {

    @Autowired
    private HeroClassRepository heroClassRepository;

    @Override
    public HeroClass save(HeroClass heroClass) {
        return heroClassRepository.save(heroClass);
    }

    @Override
    public HeroClass getOne(Integer id) {
        return heroClassRepository.getOne(id);
    }

    @Override
    public List<HeroClass> findAll() {
        return heroClassRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        heroClassRepository.deleteById(id);
    }
}
