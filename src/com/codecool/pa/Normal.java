package com.codecool.pa;

import java.time.Year;

public class Normal extends Device implements Screen {
    private final Year manufactureYear;

    public Normal(int age, int batteryLife, Year manufactureYear) {
        super(age, batteryLife);
        this.manufactureYear = manufactureYear;
    }

    @Override
    public int calculateRemainingPower() {
        final int losePerAge = 3;
        int remainingPower = batteryLife - (age * losePerAge);
        return (manufactureYear.isAfter(Year.of(1999))) ?
                remainingPower * 2 :
                remainingPower / 2;
    }

    @Override
    public ScreenSize getScreenSize() {
        return null;
    }
}
