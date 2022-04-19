package com.oopconcept;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("abstract an dencupsulation");
        Bmw bmw = new Bmw(320,2,"front","black");
        Skoda skoda = new Skoda(5000, 3,"back","red");
        Ordering order1 = new Ordering("london","paris",500);
        System.out.println(order1.delverOrder(skoda));

        CarDashboard dashboard = new CarDashboard(200,300,500);
        skoda.installDashboard(dashboard);
        System.out.println(  skoda.carInfo());
    }
}
