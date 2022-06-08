package com.codecool.pa;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Person {
    private final UUID id = UUID.randomUUID();
    private String name;
    private final Set<Borrowable> borrowedItems = new HashSet<>();
    private PersonType personType;

    public Person(String name, PersonType personType) {
        this.name = name;
        this.personType = personType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public boolean borrowItem(Borrowable borrowable) {
        if (borrowedItems.size() < personType.getMaximumBorrowedItems()) {
            borrowedItems.add(borrowable);
        } else {
            System.out.println("Can't borrow more item");
        }
    }

    public UUID getId() {
        return id;
    }
}
