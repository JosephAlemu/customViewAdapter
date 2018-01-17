package com.example.user.weektwodaytwo.model;

/**
 * Created by user on 1/16/2018.
 */

public class Animals {

    String name;
    String weight;
    String Catagory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String catagory) {
        Catagory = catagory;
    }

    public Animals(String name, String weight, String catagory) {

        this.name = name;
        this.weight = weight;
        Catagory = catagory;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", Catagory='" + Catagory + '\'' +
                '}';
    }
}
