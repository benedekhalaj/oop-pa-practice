package com.codecool.pa;

public enum ScreenSize {
    EDTV(5),
    HD(10),
    FULL_HD(15),
    UHD(20);

    private final int powerLoss;

    ScreenSize(int screenSize) {
        this.powerLoss = screenSize;
    }

    public int getPowerLoss() {
        return powerLoss;
    }
}
