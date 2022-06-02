package com.codecool.pa.postoffice;

import com.codecool.pa.postoffice.types.PostItem;
import com.codecool.pa.postoffice.types.PostItemType;

import java.time.LocalDate;

public class Letter extends PostItem {
    public Letter(String address, LocalDate postedDate) {
        super(address, postedDate);
    }

    @Override
    protected double initPrice() {
        return 1.99;
    }

    @Override
    protected PostItemType initType() {
        return PostItemType.LETTER;
    }
}
