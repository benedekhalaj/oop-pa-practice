package com.codecool.pa;

public abstract class Plant {
    protected static final int DEFAULT_PRODUCTION_BOOST = 4;
    protected int productionRate;
    protected final String name;

    public Plant(int productionRate, String name) {
        this.productionRate = productionRate;
        this.name = name;
    }

    public abstract void alterProduction();
    public int produceFood() {
        return productionRate;
    }

    public int getProductionRate() {
        return productionRate;
    }

    public String getName() {
        return name;
    }
}
