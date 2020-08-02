package com.guyot.gof23.singleton;

public enum EnumSingleton {
    INSTANCE;


    public void helloWorld() {
        System.out.printf("hello world,I am EnumSingleton");
    }


    public static void main(String[] args) {
        EnumSingleton.INSTANCE.helloWorld();
    }
}
