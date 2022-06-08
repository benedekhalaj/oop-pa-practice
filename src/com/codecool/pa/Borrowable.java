package com.codecool.pa;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Borrowable {
    protected final String name;
    protected final UUID id = UUID.randomUUID();
    protected LocalDate borrowedDate;

    public Borrowable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    @Override
    public String toString() {
        return "Borrowable{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", borrowedDate=" + borrowedDate +
                '}';
    }
}
