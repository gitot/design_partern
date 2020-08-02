package com.guyot.gof23.factory;

public interface Car {
    default void move() {
        System.out.printf("move...");
    }

}
