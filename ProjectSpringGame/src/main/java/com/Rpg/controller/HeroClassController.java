package com.Rpg.controller;

import com.Rpg.dto.HeroClassDto;
import com.Rpg.service.HeroClassService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeroClassController {

    @Autowired
    private HeroClassService heroClassService;

    @GetMapping("getHeroClass/{id}")
    @ResponseBody
    public String getOne(@PathVariable(name = "id") Integer id) {
        Gson gson = new Gson();
        return gson.toJson(new HeroClassDto(heroClassService.getOne(id)));
    }
}
