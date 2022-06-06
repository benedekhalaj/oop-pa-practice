package com.codecool.pa;

public enum ConcertType {
    INDOOR(3000, 90, 600),
    OUTDOOR(5000, 120, 800),
    FESTIVAL(800, 360, 1000);

    private final int capacity;
    private final int duration;
    private final int beerPrice;

    ConcertType(int capacity, int duration, int beerPrice) {
        this.capacity = capacity;
        this.duration = duration;
        this.beerPrice = beerPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDuration() {
        return duration;
    }

    public int getBeerPrice() {
        return beerPrice;
    }
}
