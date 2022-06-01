package com.codecool.pa;

public class StarfleetUtil {

    static int getMaximumSpeedByYear(int maximumSpeed, int year) {
        if (year < 2150) {
            return maximumSpeed - 30;
        } else if (year > 2200) {
            return maximumSpeed + 15;
        } else {
            return maximumSpeed;
        }
    }
}
