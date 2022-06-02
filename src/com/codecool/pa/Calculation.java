package com.codecool.pa;

public abstract class Calculation {

    public int getComplexNumber() {
        int number = 5 + 10;
        return number + getFinalValue();
    }

    protected abstract int getFinalValue();
}
