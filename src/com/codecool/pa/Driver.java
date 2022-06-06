package com.codecool.pa;

import java.util.List;

public class Driver {
    private final int mobileNumber;
    private final String name;
    private final int age;
    private int salary;
    private final Experience experience;
    private DriverPhonebook phonebook;

    public Driver(int mobileNumber, String name, int age, int salary, Experience experience, DriverPhonebook phonebook) {
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.phonebook = phonebook;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Experience getExperience() {
        return experience;
    }

    private List<Integer> getDriverPhoneNumbers() {
        return phonebook.getDriverMobileNumbers();
    }
}
