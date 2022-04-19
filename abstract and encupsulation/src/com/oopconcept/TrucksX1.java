package com.oopconcept;

public class TrucksX1 extends Car {
    public TrucksX1(int speed, int numberOfDoors, String gearbox, String color) {
        super(speed, numberOfDoors, gearbox, color);
    }

//    public boolean leftCargo(){
//        return  true;
//    }
    @Override
    int move() {
        return 0;
    }

    @Override
    boolean turnOn() {
        return false;
    }

    @Override
    boolean turnOf() {
        return false;
    }

    @Override
    boolean accelerate(int speed) {
        return false;
    }

    @Override
    boolean park() {
        return false;
    }
}
