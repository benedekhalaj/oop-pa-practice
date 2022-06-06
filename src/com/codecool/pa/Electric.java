package com.codecool.pa;

import java.util.UUID;

public class Electric extends Car {
    public static final int COST = 400;
    private Driver driver;

    public Electric(UUID id, Driver driver) {
        super(id, COST, driver.getExperience().getRidesPerWeek());
        this.driver = driver;
    }
}
