package com.codecool.pa;

import java.util.ArrayList;
import java.util.List;


public class Farm {
    private final List<Plant> plants = new ArrayList<>();
    private int totalFood = 0;

    public void produceAMonth() {
        alterProduction();
        growLeaves();
        growMushrooms();
        if (rot()) {
            return;
        }
        totalFood += getFood();
    }

    private void alterProduction() {
        plants.forEach(Plant::alterProduction);
    }

    private void growLeaves() {
        plants.stream()
                .filter(plant -> plant instanceof Evergreen)
                .map(plant -> (Evergreen) plant)
                .toList()
                .forEach(Evergreen::growLeaves);
    }

    private void growMushrooms() {
        plants.stream()
                .filter(plant -> plant instanceof GrowMushroom)
                .map(plant -> (GrowMushroom) plant)
                .toList()
                .forEach(GrowMushroom::growMushroom);
    }

    private boolean rot() {
        return plants.stream()
                .filter(plant -> plant instanceof Rot)
                .map(plant -> (Rot) plant)
                .anyMatch(Rot::rot);
    }

    private int getFood() {
        return plants.stream()
                .map(Plant::produceFood)
                .reduce(0, Integer::sum);
    }

    public List<Plant> getPlants() {
        return new ArrayList<>(plants);
    }

    public int getTotalFood() {
        return totalFood;
    }
}
