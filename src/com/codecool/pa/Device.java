package com.codecool.pa;

public abstract class Device {
    protected int age;
    protected int batteryLife;

    public Device(int age, int batteryLife) {
        this.age = age;
        this.batteryLife = batteryLife;
    }

    public int getAge() {
        return age;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public abstract int calculateRemainingPower();
}
