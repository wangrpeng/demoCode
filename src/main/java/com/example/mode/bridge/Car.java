package com.example.mode.bridge;

public abstract class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }


    public abstract void drive();

    public abstract String getBrand();


}
