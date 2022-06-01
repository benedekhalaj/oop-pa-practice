package com.codecool.pa;

import java.util.*;

public class CargoShip extends Spacecraft implements Mobile {
    private final int maximumSpeed;
    private Map<Cargo, Integer> cargo = new HashMap<>();
    private static final int MAXIMUM_CARGO = 5;
    private SpaceStation spaceStation = null;

    public CargoShip(UUID registrationCode, String name, int year) {
        super(registrationCode, name, year);
        maximumSpeed = StarfleetUtil.getMaximumSpeedByYear(150, year);
        Random random = new Random();
        for (Cargo cargo : Cargo.values()) {
            this.cargo.put(cargo, random.nextInt(MAXIMUM_CARGO + 1));
        }
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void unDock() {
        if (isDocked()) {
            if (spaceStation.tryToUndock(this)) {
                this.spaceStation = null;
            }
        }
    }

    @Override
    public void dock() {
        if (!isDocked()) {
            Space space = Space.getInstance();
            List<SpaceStation> spaceStations = space.getSpaceStations();
            for (SpaceStation spaceStation : spaceStations) {
                if (spaceStation.tryToDock(this)) {
                    this.spaceStation = spaceStation;
                    System.out.printf("Registration code: %s" +
                            "Cargo: %s" +
                            "\n", registrationCode, cargo);
                    return;
                }
            }
            System.out.println("Every Space Station was full!");
        } else {
            System.out.println("Cannot dock while docked!");
        }
    }

    private boolean isDocked() {
        return spaceStation != null;
    }

    @Override
    public int getMaximumSpeed() {
        return maximumSpeed;
    }
}
