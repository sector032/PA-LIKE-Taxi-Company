package com.codecool.taxi.vehicles;

import com.codecool.taxi.Driver;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Car {
    public String id;
    public int cost;
    public boolean hasDriver;
    public int ridesPerWeek;
    public Driver driver;

    public Car(){
        this.id = UUID.randomUUID().toString();

    }

    public void setRidesPerWeek(){
        this.ridesPerWeek = driver.getDriverExperience().getPassenger();
    }

    public void setDriver(Driver driver){
        this.driver = driver;
        this.hasDriver = true;
    }

    public int getCost() {
        return cost;
    }

    public int getRidesPerWeek() {
        return ridesPerWeek;
    }
}
