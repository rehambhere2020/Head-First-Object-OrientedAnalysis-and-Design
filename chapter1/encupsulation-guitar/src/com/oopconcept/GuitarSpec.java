package com.oopconcept;

public class GuitarSpec {
    private Type type;
    private  Wood topWood;
    private Builder builder;
    private Wood backWood;
    private String model;

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Type getType() {
        return type;
    }


    public Builder getBuilder() {
        return builder;
    }
}
