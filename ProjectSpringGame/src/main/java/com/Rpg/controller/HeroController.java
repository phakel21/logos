package com.Rpg.controller;

import com.Rpg.dto.HeroDto;
import com.Rpg.service.HeroService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping("getUser/{id}")
    @ResponseBody
    public String getOne(@PathVariable(name = "id") Integer id) {
        Gson gson = new Gson();
        return gson.toJson(new HeroDto(heroService.getOneWithHeroBonus(id)));
    }

}
