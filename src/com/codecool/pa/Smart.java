package com.codecool.pa;

public class Smart extends Device implements Screen {
    private final String name;
    private final ScreenSize screenSize;
    private final NormalInfo normalInfo;

    public Smart(int age, int batteryLife, String name, ScreenSize screenSize, NormalInfo normalInfo) {
        super(age, batteryLife);
        this.name = name;
        this.screenSize = screenSize;
        this.normalInfo = normalInfo;
    }

    @Override
    public int calculateRemainingPower() {
        int losePerAge = 15;
        return batteryLife - (age * losePerAge) - screenSize.getPowerLoss();
    }

    @Override
    public ScreenSize getScreenSize() {
        return screenSize;
    }

    public String getName() {
        return name;
    }

    public int getNormalDeviceCountInBatteryRange(int range) {
        return normalInfo.getNormalDeviceCountInBatteryRange(calculateRemainingPower(), range);
    }
}
