package com.codecool.pa;

public abstract class Evergreen extends Plant {
    protected static final int MAXIMUM_PRODUCTION_RATE = 70;
    protected static final int LEAF_PRODUCTION_BOOST = 8;
    protected static final int MONTHS_TO_PRODUCE_LEAF = 5;
    protected int currentMonth = 0;

    public Evergreen(int productionRate, String name) {
        super(productionRate, name);
    }

    public void growLeaves() {
        if (++currentMonth >= MONTHS_TO_PRODUCE_LEAF) {
            currentMonth = 0;
            productionRate += LEAF_PRODUCTION_BOOST;
        }
        setMaximumProductionRate();
    }

    protected void setMaximumProductionRate() {
        if (productionRate > MAXIMUM_PRODUCTION_RATE) {
            productionRate = MAXIMUM_PRODUCTION_RATE;
            System.out.println(name + " at full production!");
        }
    }
}
