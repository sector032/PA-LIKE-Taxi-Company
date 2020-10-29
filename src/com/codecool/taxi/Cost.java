package com.codecool.taxi;

public enum Cost {
    Gasoline(350),
    Electronic(400),
    SelfDriving(740);

    public int getValue() {
        return this.value;
    }

    private int value;

    Cost(int cost) {
        this.value = cost;
    }
}
