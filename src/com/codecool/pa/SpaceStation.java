package com.codecool.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SpaceStation extends Spacecraft {
    private final Mobile[] dock = new Mobile[2];

    public SpaceStation(UUID registrationCode, String name, int year, Mobile[] dock) {
        super(registrationCode, name, year);
    }

    @Override
    public String getType() {
        return "SpaceStation";
    }

    public List<Spacecraft> generateSpacecrafts(Spacecraft spacecraft) {
        return new ArrayList<>();
    }

    public boolean isDockAvailable() {
        return dock[0] == null || dock[1] == null;
    }

    public boolean tryToDock(Mobile mobileShip) {
        for (int i = 0; i < dock.length; i++) {
            if (dock[i] == null) {
                dock[i] = mobileShip;
                return true;
            }
        }
        System.out.println("Dock is full!");
        return false;
    }

    public boolean tryToUndock(Mobile mobileShip) {
        for (int i = 0; i < dock.length; i++) {
            if (dock[i].equals(mobileShip)) {
                dock[i] = null;
                return true;
            }
        }
        System.out.println("Ship isn't docked");
        return false;
    }
}
