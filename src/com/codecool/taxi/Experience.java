package com.codecool.taxi;

import java.util.Random;

public enum Experience {
    Beginner(15),
    Advanced(25),
    Professional(40);

    private int passenger;

    public int getPassenger() {
        return passenger;
    }

    Experience(int passenger) {
        this.passenger = passenger;
    }

    public static Experience getRandomExperience() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        return switch (randomNumber) {
            case 0 -> Beginner;
            case 1 -> Advanced;
            case 2 -> Professional;
            default -> null;
        };
    }
}
