package com.codecool.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Space {
    private static Space instance;
    private final List<Spacecraft> spacecrafts = new ArrayList<>();

    private Space () {
    }

    public static Space getInstance() {
        if (instance == null) {
            instance = new Space();
        }
        return instance;
    }

    public void addSpaceCraft(Spacecraft spacecraft) {
        spacecrafts.add(spacecraft);
    }

    public List<SpaceStation> getSpaceStations() {
        return spacecrafts.stream()
                .filter(spacecraft -> spacecraft instanceof SpaceStation)
                .map(spacecraft -> (SpaceStation) spacecraft)
                .collect(Collectors.toList());
    }


}
