package com.codecool.pa;

public enum PersonType {
    STUDENT(3),
    TOWN_RESIDENT(5);

    private final int maximumBorrowedItems;

    PersonType(int maximumBorrowedItems) {
        this.maximumBorrowedItems = maximumBorrowedItems;
    }

    public int getMaximumBorrowedItems() {
        return maximumBorrowedItems;
    }
}
