package com.codecool.pa;

import java.util.UUID;

public abstract class Car {
    protected static final int MONEY_PER_PASSENGER = 1;
    protected final UUID id;
    protected final int cost;
    protected int passengersPerWeek;

    public Car(UUID id, int cost, int passengersPerWeek) {
        this.id = id;
        this.cost = cost;
        this.passengersPerWeek = passengersPerWeek;
    }

    public UUID getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public int getPassengersPerWeek() {
        return passengersPerWeek;
    }

    public int getIncome() {
        return passengersPerWeek * MONEY_PER_PASSENGER;
    }
}
