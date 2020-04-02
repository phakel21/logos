package com.Rpg.setting;

import com.Rpg.entity.Location;
import com.Rpg.service.LocationService;

import java.util.Scanner;

public class LocationSetting {

    public void createLocation(Scanner scanner, LocationService locationService) {
        Location location = new Location();
        System.out.println("Введіть назву локації:");
        location.setName(scanner.next());
        locationService.save(location);
    }

    public void deleteLocation(Scanner scanner, LocationService locationService) {
        System.out.println("Введіть id локації");
        locationService.deleteById(scanner.nextInt());
    }
}
