package com.Rpg.repository;

import com.Rpg.entity.HeroClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroClassRepository extends JpaRepository<HeroClass, Integer> {

}
