package com.oopconcept;

public class Bmw extends Car{

    public Bmw(int speed, int numberOfDoors, String gearbox, String color) {
        super(speed, numberOfDoors, gearbox, color);
    }

    @Override
    int move() {
        return this.speed *2;
    }

    @Override
    boolean turnOn() {
        this.turnsOn =true;
        return true;
    }

    @Override
    boolean turnOf() {
        return false;
    }

    @Override
    boolean accelerate(int speed) {
        this.speed = speed*5;
        return true;
    }

    @Override
    boolean park() {
        return true;
    }
}
