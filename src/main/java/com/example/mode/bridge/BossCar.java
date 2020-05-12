package com.example.mode.bridge;

/**
 * BoosCar类, 是接口Car的一种品牌,
 * 如果要增加一个品牌，只需要针对RefinedCar派生一个子类
 */
public class BossCar extends RefinedCar {
    public BossCar(Engine engine) {
        super(engine);
    }

    public String getBrand() {
        return "Boss";
    }
}