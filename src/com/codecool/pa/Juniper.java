package com.codecool.pa;

public class Juniper extends Evergreen {
    private static final int DEFAULT_PRODUCTION_RATE = 14;

    public Juniper(String name) {
        super(DEFAULT_PRODUCTION_RATE, name);
    }

    @Override
    public void alterProduction() {
        productionRate += DEFAULT_PRODUCTION_BOOST;
        setMaximumProductionRate();
    }
}
