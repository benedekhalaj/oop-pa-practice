package com.codecool.pa;

import java.util.Random;

public enum Experience {
    BEGINNER(15),
    ADVANCED(25),
    PROFESSIONAL(40);

    private final int ridesPerWeek;

    Experience(int ridesPerWeek) {
        this.ridesPerWeek = ridesPerWeek;
    }

    public int getRidesPerWeek() {
        return ridesPerWeek;
    }

    public static Experience getRandomExperience(Random random) {
        return values()[random.nextInt(values().length)];
    }
}
