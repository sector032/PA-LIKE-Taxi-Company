package com.codecool.taxi.vehicles;

import com.codecool.taxi.Cost;

public class Gasoline extends Car {
    public int maintenanceCost;

    public Gasoline() {
        super();
        this.cost = Cost.Gasoline.getValue();
        this.maintenanceCost = 20;
    }

    public void incrementMaintenanceCost() {
        this.maintenanceCost *= 1.1;

    }

    public int getMaintenanceCost() {
        return maintenanceCost;
    }
}
