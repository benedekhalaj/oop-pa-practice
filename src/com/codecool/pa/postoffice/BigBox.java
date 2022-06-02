package com.codecool.pa.postoffice;

import com.codecool.pa.postoffice.types.Box;
import com.codecool.pa.postoffice.types.PostItemType;

import java.time.LocalDate;
import java.util.Date;

public class BigBox extends Box {
    private static final double BASE_PRICE = 10.29;
    private static final double PRICE_BY_WEIGHT = 10.29;

    public BigBox(String address, LocalDate postedDate, int weight) {
        super(address, postedDate, weight);
    }

    @Override
    protected double initPrice() {
        return BASE_PRICE + (PRICE_BY_WEIGHT * weight);
    }

    @Override
    protected PostItemType initType() {
        return PostItemType.BIG_BOX;
    }
}
