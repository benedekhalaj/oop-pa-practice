package com.codecool.pa.postoffice.types;

import java.time.LocalDate;

public abstract class PostItem {
    protected String address;
    protected LocalDate postedDate;
    protected double price;
    protected PostItemType type;

    public PostItem(String address, LocalDate postedDate) {
        this.address = address;
        this.postedDate = postedDate;
        // public abstract getPrice() or constant field PRICE
        price = initPrice();
        type = initType();
    }

    protected abstract double initPrice();

    protected abstract PostItemType initType();

    public String getAddress() {
        return address;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public double getPrice() {
        return price;
    }

    public PostItemType getType() {
        return type;
    }
}
