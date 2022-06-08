package com.codecool.pa;

import java.util.HashSet;
import java.util.Set;

public class LocalLibrary {
    private final Set<Borrowable> borrowableItems = new HashSet<>();
    private final Set<Borrowable> borrowedItems = new HashSet<>();
    private final Set<Person> registeredPeople = new HashSet<>();

    public boolean register(Person person) {
        return false;
    }

    public boolean borrowItem(Person person, Borrowable borrowable) {
        if (!registeredPeople.contains(person)) {
            System.out.println("Register first!");
            return false;
        } else if (!borrowableItems.contains(borrowable)) {
            System.out.println(borrowable + " borrowable not in library!");
            return false;
        } else if (!person.borrowItem(borrowable)) {
            return false;
        }
        borrowableItems.remove(borrowable);
        borrowableItems.add(borrowable);
        return true;
    }

    public boolean giveBackItem(Person person, Borrowable borrowable) {
        return false;
    }
}
