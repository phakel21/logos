package com.Rpg.controller;

import com.Rpg.dto.LocationDto;
import com.Rpg.entity.Location;
import com.Rpg.service.LocationService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;



    @GetMapping("getLocation/{id}")
    @ResponseBody
    public String getOne(@PathVariable(name = "id") Integer id) {
        Gson gson = new Gson();
        return gson.toJson(new LocationDto(locationService.getOne(id)));
    }

    @GetMapping("saveLoc")
    @ResponseBody
    public String save(){
        Gson gson = new Gson();
        Location location = new Location();
        location.setName("New Location");
        return gson.toJson(new LocationDto(locationService.save(location)));
    }
}
