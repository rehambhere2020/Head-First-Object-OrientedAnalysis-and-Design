package com.oopconcept;

public abstract  class Car {
protected int speed ;
protected int numberOfDoors;
protected String gearbox;
protected String color;
private CarDashboard carDashboard;
protected boolean turnsOn= false;
    public Car(int speed, int numberOfDoors, String gearbox, String color) {
        this.speed = speed;
        this.numberOfDoors = numberOfDoors;
        this.gearbox = gearbox;
        this.color = color;
    }

public  void installDashboard(CarDashboard carDashboard){
        this.carDashboard = carDashboard;
}
public String carInfo(){
if (this.carDashboard !=null){
    return  this.carDashboard.readDashboard();
}else{
    return "no have dashboard";
}

}
    abstract int move();
abstract boolean turnOn();
abstract  boolean turnOf();
abstract  boolean accelerate(int speed);
abstract  boolean park();

}
