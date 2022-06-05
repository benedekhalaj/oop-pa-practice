package com.codecool.pa;

import java.util.Random;

public class Almond extends Plant implements GrowMushroom, Rot {
    private static final int DEFAULT_PRODUCTION_RATE = 50;
    private static final int MUSHROOM_PRODUCTION_CHANCE = 8;
    private static final int MUSHROOM_PRODUCTION_BOOST = 10;
    private static final int ROT_CHANCE = 13;
    private static final int ROT_PRODUCTION_REDUCE = 18;
    private static final int HUNDRED_PERCENT = 100;
    private final Random random;

    public Almond(String name, Random random) {
        super(DEFAULT_PRODUCTION_RATE, name);
        this.random = random;
    }

    @Override
    public void alterProduction() {
        productionRate += DEFAULT_PRODUCTION_BOOST;
    }

    @Override
    public void growMushroom() {
        int mushroomProduction = random.nextInt(HUNDRED_PERCENT);
        if (mushroomProduction < MUSHROOM_PRODUCTION_CHANCE) {
            productionRate += MUSHROOM_PRODUCTION_BOOST;
        }
    }

    @Override
    public boolean rot() {
        int rot = random.nextInt(HUNDRED_PERCENT);
        if (rot < ROT_CHANCE) {
            productionRate -= ROT_PRODUCTION_REDUCE;
            return true;
        }
        return false;
    }
}
