package com.codecool.taxi;

import com.codecool.taxi.vehicles.Car;

import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public String name;
    public int age;
    public int salary;
    public int phoneNumber;
    public Experience driverExperience;
    public ArrayList<Integer> phoneList;

    public Driver(String name, int age) {
        randomPhoneNumber();
        this.name = name;
        this.age = age;
        this.driverExperience = Experience.getRandomExperience();
        this.phoneList = new ArrayList<>();
    }

    public void randomPhoneNumber() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            sb.append(random.nextInt(10));
        }
        this.phoneNumber = Integer.parseInt(sb.toString());
    }

    public void setPhoneList(ArrayList<Driver> driverList){
        for(Driver driver: driverList){
            phoneList.add(driver.getPhoneNumber());
        }
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }


    public void setSalary(Car car) {
        this.salary = car.getCost();
    }

    public Experience getDriverExperience() {
        return driverExperience;
    }

    public void addNumberToPhoneList(Integer phoneNumber){
        phoneList.add(phoneNumber);
    }

    public int getSalary() {
        return salary;
    }
}
