package com.codecool.taxi.vehicles;

import com.codecool.taxi.Cost;

public class Electronic extends Car {
    public Electronic() {
        super();
        this.cost = Cost.Electronic.getValue();
    }
}
