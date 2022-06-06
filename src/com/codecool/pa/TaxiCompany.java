package com.codecool.pa;

import java.util.*;

public class TaxiCompany implements DriverPhonebook {
    private static final int MONEY_REQUIRED_TO_BUY_CAR = 1000;
    private static final int ELECTRIC_CAR_RANDOM_ID = 0;
    private static final int SELF_DRIVING_CAR_RANDOM_ID = 1;
    private static final int MAX_CAR_RANDOM_ID = 1;
    private static final int MINIMUM_PHONE_NUMBER = 10000;
    private static final int MAXIMUM_PHONE_NUMBER = 99999;
    private static final int MAXIMUM_AGE = 40;
    private int money;
    private final Set<Car> cars = new HashSet<>();
    private final Set<Driver> drivers = new HashSet<>();
    private Random random;

    public TaxiCompany(int money, Random random) {
        this.money = money;
        this.random = random;
    }

    public void registerCar(Car car) {
        cars.add(car);
    }

    public int getMoney() {
        return money;
    }

    public Set<Car> getCars() {
        return new HashSet<>(cars);
    }

    public Set<Driver> getDrivers() {
        return new HashSet<>(drivers);
    }

    public void simulateWeek() {
        maintainGasolineCars();
        setSelfDrivingCarsStatus(false);
        buyCars();
        harvestIncome();
    }

    private void maintainGasolineCars() {
        money -= cars.stream()
                .filter(car -> car instanceof GasolineUser)
                .map(car -> (GasolineUser) car)
                .map(GasolineUser::getMaintenanceCost)
                .reduce(0, Integer::sum);
    }

    private void buyCars() {
        if (money >= MONEY_REQUIRED_TO_BUY_CAR) {
            int carRandomId = random.nextInt(MAX_CAR_RANDOM_ID + 1);
            switch (carRandomId) {
                case ELECTRIC_CAR_RANDOM_ID -> {
                    money -= Electric.COST;
                    Driver driver = getRandomDriverNamedJack();
                    Electric electric = new Electric(UUID.randomUUID(), driver);
                    cars.add(electric);
                    drivers.add(driver);
                }
                case SELF_DRIVING_CAR_RANDOM_ID -> {
                    money -= SelfDriving.COST;
                    setSelfDrivingCarsStatus(true);
                    SelfDriving selfDriving = new SelfDriving(UUID.randomUUID());
                    cars.add(selfDriving);
                }
            }
        }
    }

    private void setSelfDrivingCarsStatus(boolean isOutOfOrder) {
        cars.stream()
                .filter(car -> car instanceof SelfDriving)
                .map(car -> (SelfDriving) car)
                .toList()
                .forEach(selfDriving -> selfDriving.setOutOfOrder(isOutOfOrder));
    }

    private Driver getRandomDriverNamedJack() {
        int randomPhoneNumber = random.nextInt(MINIMUM_PHONE_NUMBER, MAXIMUM_PHONE_NUMBER);
        int randomAge = random.nextInt(MAXIMUM_AGE);
        Experience randomExperience = Experience.getRandomExperience(random);
        return new Driver(
                randomPhoneNumber,
                "Jack",
                randomAge,
                Electric.COST,
                randomExperience,
                this
        );
    }

    private void harvestIncome() {
        money += cars.stream()
                .filter(car -> !(car instanceof SelfDriving) || !((SelfDriving) car).isOutOfOrder())
                .map(Car::getIncome)
                .reduce(0, Integer::sum);
    }

    @Override
    public List<Integer> getDriverMobileNumbers() {
        return null;
    }
}
