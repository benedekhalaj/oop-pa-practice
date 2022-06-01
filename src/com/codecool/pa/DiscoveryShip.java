package com.codecool.pa;

import java.util.UUID;

public class DiscoveryShip extends Spacecraft implements Mobile {
    private final int maximumSpeed;


    public DiscoveryShip(UUID registrationCode, String name, int year) {
        super(registrationCode, name, year);
        maximumSpeed = StarfleetUtil.getMaximumSpeedByYear(450, year);
    }

    @Override
    public void unDock() {

    }

    @Override
    public void dock() {

    }

    @Override
    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    @Override
    public String getType() {
        return null;
    }
}
