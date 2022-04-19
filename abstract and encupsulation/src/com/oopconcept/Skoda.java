package com.oopconcept;

public class Skoda extends Car {

    public Skoda(int speed, int numberOfDoors, String gearbox, String color) {
        super(speed, numberOfDoors, gearbox, color);
    }

    @Override
    int move() {
        return 0;
    }

    @Override
    boolean turnOn() {
        this.turnsOn=true;
        return true;
    }

    @Override
    boolean turnOf() {
        this.turnsOn = false;
        return true;
    }

    @Override
    boolean accelerate(int speed) {
        this.speed = speed;
        return true;
    }

    @Override
    boolean park() {
        return true;
    }
}
