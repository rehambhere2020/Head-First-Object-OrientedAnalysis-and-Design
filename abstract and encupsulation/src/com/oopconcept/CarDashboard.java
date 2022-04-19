package com.oopconcept;

public class CarDashboard {

protected  int oilLevel;
protected  int fulevel;
protected int airPrusser;

    public CarDashboard(int oilLevel, int fulevel, int airPrusser) {
        this.oilLevel = oilLevel;
        this.fulevel = fulevel;
        this.airPrusser = airPrusser;
    }

    private int getOilLevel() {
        return oilLevel;
    }


    private int getFulevel() {
        return fulevel;
    }


    private int getAirPrusser() {
        return airPrusser;
    }


    public  String readDashboard(){
        return " welcome my dashboard" + this.getAirPrusser() + " oil level "+ this.getOilLevel() + " fulllevel"+ this.getFulevel();
    }
}
