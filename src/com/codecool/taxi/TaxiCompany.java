package com.codecool.taxi;

import com.codecool.taxi.vehicles.Car;
import com.codecool.taxi.vehicles.Electronic;
import com.codecool.taxi.vehicles.Gasoline;
import com.codecool.taxi.vehicles.SelfDriving;

import java.util.ArrayList;
import java.util.Collections;

public class TaxiCompany {
    public int totalMoney;
    public ArrayList<Driver> driverList;
    public ArrayList<Car> carList;
    public ArrayList<Integer> numberList;

    public TaxiCompany() {
        this.driverList = new ArrayList<>();
        this.carList = new ArrayList<>();
        this.numberList = new ArrayList<>();
        this.totalMoney = 10;
    }

    public void buyCars() {

    }

    public void hireDrivers() {
    }

    public void addDriver(Driver driver) {
        driverList.add(driver);
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void setRandomDriver() {
        Collections.shuffle(driverList);
        int j = 0;
        for (int i = 0; i < carList.size(); i++) {
            if (!(carList.get(i) instanceof SelfDriving)) {
                carList.get(i).setDriver(driverList.get(j));
                driverList.get(j).setSalary(carList.get(i));
                j++;
            }
        }
    }

    public void fillPhoneList() {
        for (Driver driver : driverList) {
            numberList.add(driver.getPhoneNumber());
        }
        fillDriverPhone();
    }

    public void fillDriverPhone() {
        for (Driver driver : driverList) {
            for (Number number : numberList) {
                if (!number.equals(driver.getPhoneNumber())) {
                    driver.addNumberToPhoneList((Integer) number);
                }
            }
        }
    }

    public void updateWeek() {
        for (Car car : carList) {
            if (!(car instanceof SelfDriving)) {
                car.setRidesPerWeek();
            }
            if (car instanceof Gasoline) {
                ((Gasoline) car).incrementMaintenanceCost();
            }
        }
        this.totalMoney += countWeeklyIncome();
        this.totalMoney -= countWeeklyExpense();

    }

    public int countWeeklyIncome() {
        int weeklyIncome = 0;
        for (Car car : carList) {
            weeklyIncome += car.getRidesPerWeek();
        }
        return weeklyIncome;
    }

    public int countWeeklyExpense() {
        int weeklyExpense = 0;
        for (Driver driver : driverList) {
            weeklyExpense += driver.getSalary();
        }
        for (Car car : carList) {
            if (car instanceof Gasoline) {
                weeklyExpense += ((Gasoline) car).getMaintenanceCost();

            }
        }
        return weeklyExpense;
    }
}
