package com.codecool.taxi;

import com.codecool.taxi.vehicles.Car;
import com.codecool.taxi.vehicles.Electronic;
import com.codecool.taxi.vehicles.Gasoline;
import com.codecool.taxi.vehicles.SelfDriving;

import static com.codecool.taxi.Cost.SelfDriving;

public class Main {
    public static void main(String[] args) {
        TaxiCompany taxiCompany = new TaxiCompany();
        Gasoline car1 = new Gasoline();
        Electronic car2 = new Electronic();
        SelfDriving car3= new SelfDriving();
        taxiCompany.addCar(car1);
        taxiCompany.addCar(car2);
        taxiCompany.addCar(car3);

        Driver driver1 = new Driver("Dani", 29);
        Driver driver2 = new Driver("David", 19);
        taxiCompany.addDriver(driver1);
        taxiCompany.addDriver(driver2);
        taxiCompany.setRandomDriver();
        taxiCompany.fillPhoneList();
        taxiCompany.updateWeek();
        taxiCompany.updateWeek();


    }
}
