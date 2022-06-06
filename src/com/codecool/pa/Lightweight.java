package com.codecool.pa;

public class Lightweight extends Device {
    private final LightweightInfo lightweightInfo;

    public Lightweight(int age, int batteryLife, LightweightInfo lightweightInfo) {
        super(age, batteryLife);
        this.lightweightInfo = lightweightInfo;
    }

    @Override
    public int calculateRemainingPower() {
        final int losePerAge = 7;
        final int gainPerDevice = 20;
        return batteryLife - (age * losePerAge) + (getLightweightDeviceCount() * gainPerDevice);
    }

    public int getLightweightDeviceCount() {
        return lightweightInfo.getLightweightDeviceCount() - 1;
    }
}
