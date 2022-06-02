package com.codecool.pa.postoffice;

import com.codecool.pa.postoffice.types.Box;
import com.codecool.pa.postoffice.types.PostItemType;

import java.time.LocalDate;
import java.util.Date;

public class SmallBox extends Box {
    private static final double PRICE = 7.99;
    public SmallBox(String address, LocalDate postedDate, int weight) {
        super(address, postedDate, weight);
    }

    @Override
    protected double initPrice() {
        return 7.99;
    }

    @Override
    protected PostItemType initType() {
        return PostItemType.SMALL_BOX;
    }
}
