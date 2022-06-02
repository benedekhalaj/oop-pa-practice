package com.codecool.pa.postoffice.types;

import java.time.LocalDate;

public abstract class Box extends PostItem {
    protected int weight;

    public Box(String address, LocalDate postedDate, int weight) {
        super(address, postedDate);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
