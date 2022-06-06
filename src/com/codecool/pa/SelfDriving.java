package com.codecool.pa;

import java.util.UUID;

public class SelfDriving extends Car {
    private boolean outOfOrder = false;

    public static final int COST = 740;
    private static final int PASSENGERS_PER_WEEK = 70;

    public SelfDriving(UUID id) {
        super(id, COST, PASSENGERS_PER_WEEK);
    }

    public void setOutOfOrder(boolean outOfOrder) {
        this.outOfOrder = outOfOrder;
    }

    public boolean isOutOfOrder() {
        return outOfOrder;
    }
}
