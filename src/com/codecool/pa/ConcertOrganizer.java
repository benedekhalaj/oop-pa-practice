package com.codecool.pa;

import java.util.*;

public class ConcertOrganizer {
    private static final int RAIN_CHANCE = 12;
    private static final int HUNDRED_PERCENT = 100;
    private final String name;
    private double totalProfit = 0;
    private final Set<Band> bands = new HashSet<>();

    public ConcertOrganizer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void performConcert(Concert concert) {
        totalProfit += concert.getProfit();
    }

    public void cancelOutdoorConcert(Concert concert) {
        if (concert.getConcertType() == ConcertType.OUTDOOR) {
            concert.cancel("rain");
        } else {
            throw new IllegalArgumentException("Invalid concert type! Required: Outdoor");
        }
    }
}
