package com.guyot.gof23.factory;

public class Main {
    public static void main(String[] args) {
        Car toyota = CarFactory.getCar("TOYOTA");
        toyota.move();
    }
}
