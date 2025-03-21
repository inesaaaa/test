package com.flawedbank;

public class Car {
    private String name;
    private int year;

    //Constructor
    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
