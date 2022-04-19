package com.oopconcept;

public class Ordering {

    private  String source;
    private  String  destanation;
    private  int weight;

    public Ordering(String source, String destanation, int weight) {
        this.source = source;
        this.destanation = destanation;
        this.weight = weight;
    }

    public String delverOrder(Car car){
        car.turnOn();
        car.move();
        car.accelerate(120);
        car.park();
        car.turnOf();
//        if(car instanceof  WeightHolder){
//            ((WeightHolder) car).leftCargo();
//        }
        return " Iam moving from " + this.source +" to "+ this.destanation +" to deleviry apackge of"+this.weight+"K.G";
    }
}
