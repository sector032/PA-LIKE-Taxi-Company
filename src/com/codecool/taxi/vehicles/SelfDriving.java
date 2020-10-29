package com.codecool.taxi.vehicles;

import com.codecool.taxi.Cost;

public class SelfDriving extends Car {
    public SelfDriving() {
        super();
        this.cost = Cost.SelfDriving.getValue();
        this.ridesPerWeek = 70;
    }
}
