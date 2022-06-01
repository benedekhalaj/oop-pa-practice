package com.codecool.pa;

import java.util.UUID;

public abstract class Spacecraft {
    protected final UUID registrationCode;
    protected final String name;
    protected final int year;

    public Spacecraft(UUID registrationCode, String name, int year) {
        this.registrationCode = registrationCode;
        this.name = name;
        this.year = year;
    }

    public UUID getRegistrationCode() {
        return registrationCode;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public abstract String getType();
}
