package com.Rpg.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Monster> monsters;

    public Location() {
    }

    public Location(Integer locationId, String name, List<Monster> monsters) {
        this.locationId = locationId;
        this.name = name;
        this.monsters = monsters;
    }

    public String toString() {
        return "Location{" +
                "id=" + locationId +
                ", name='" + name + '\'' +
                ", monsters=" + monsters +
                '}';
    }
}
