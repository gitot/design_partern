package com.guyot.gof23.factory;

/**
 * 假设创建过程十分复杂。或者假设不同的名字创建不同的Car的子类。
 * 如果是后者，可以使用工厂方法。不同的子类Car对应不同的CarFactory的子类，因为各自的创建与初始化过程可能大相径庭。
 */

public class CarFactory {
    public static Car getCar(String name) {

        /**
         * 搜集零件，组装，喷漆...等过程省略
         */
        Car car = new Car() {
            @Override
            public void move() {
                System.out.println("I am Toyota");
            }
        };
        return car;
    }
}
