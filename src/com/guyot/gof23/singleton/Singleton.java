package com.guyot.gof23.singleton;

public class Singleton {
    public void helloWorld() {
        System.out.printf("Hello world,I am a singleton: ");
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.helloWorld();
    }
}
