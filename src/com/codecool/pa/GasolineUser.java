package com.codecool.pa;

import java.util.UUID;

public class GasolineUser extends Car {
    public static final int COST = 350;
    private int maintenanceCost = 20;
    private Driver driver;

    public GasolineUser(UUID id, Driver driver) {
        super(id, COST, driver.getExperience().getRidesPerWeek());
        this.driver = driver;
    }

    public void maintain() {
        maintenanceCost += maintenanceCost / 10;
    }

    public int getMaintenanceCost() {
        return maintenanceCost;
    }

}
