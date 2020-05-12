package com.example.mode.bridge;

/**
 * ，在一个“修正”的抽象类RefinedCar中定义一些额外操作：
 */
public abstract class RefinedCar extends Car{

    public RefinedCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("Drive " + getBrand() + " Car...");
    }

    public abstract String getBrand();
}
