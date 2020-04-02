package com.Rpg.controller;

import com.Rpg.dto.MonsterDto;
import com.Rpg.dto.HeroDto;
import com.Rpg.entity.Hero;
import com.Rpg.entity.Monster;
import com.Rpg.service.HeroService;
import com.Rpg.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FightController {

    @Autowired
    private HeroService heroService;
    @Autowired
    private MonsterService monsterService;

    @GetMapping("/fight/{userId}/{monsterId}")
    public String getFightJSP(Model model,
            @PathVariable(name = "userId") Integer userId,
            @PathVariable(name = "monsterId") Integer monsterId){

        Hero hero = heroService.getOne(userId);
        Monster monster = monsterService.getOne(monsterId);

        model.addAttribute("user", new HeroDto(hero));
        model.addAttribute("monster", new MonsterDto(monster));
        return "fight";
    }



    @PostMapping("/fight/{userId}/{monsterId}")
    public String fight(Model model,
                           @RequestParam(name = "choose") int choose,
                           @PathVariable(name = "userId") Integer userId,
                           @PathVariable(name = "monsterId") Integer monsterId){

        Hero hero = heroService.getOne(userId);
        Monster monster = monsterService.getOne(monsterId);

        if(choose == 1) {
            heroService.kick(hero, monster);
        }
        model.addAttribute("user", new HeroDto(hero));
        model.addAttribute("monster", new MonsterDto(monster));
        return "redirect:" + monsterId;

    }
}
