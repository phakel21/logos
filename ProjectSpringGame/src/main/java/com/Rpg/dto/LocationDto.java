package com.Rpg.dto;

import com.Rpg.entity.Location;
import com.Rpg.entity.Monster;

import java.util.ArrayList;
import java.util.List;

public class LocationDto {

    private Integer locationId;

    private String name;

    private List<MonsterDto> monsters = new ArrayList<>();

    public LocationDto(Location location) {
        this.locationId = location.getLocationId();
        this.name = location.getName();
        if(location.getMonsters() != null){
            for(Monster monster : location.getMonsters()){
                this.monsters.add(new MonsterDto(monster));
            }
        }
    }


    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MonsterDto> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<MonsterDto> monsters) {
        this.monsters = monsters;
    }
}
