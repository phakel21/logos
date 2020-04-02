package com.Rpg.controller;

import com.Rpg.dto.MonsterDto;
import com.Rpg.service.MonsterService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MonsterController {

    @Autowired
    private MonsterService monsterService;


    @GetMapping("getMonster/{id}")
    @ResponseBody
    public String getOne(@PathVariable(name = "id") Integer id) {
        Gson gson = new Gson();
        return gson.toJson(new MonsterDto(monsterService.getOne(id)));
    }
}
