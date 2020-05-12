package com.example.mode.bridge;

import java.io.*;

/**
 * 桥接模式:
 * 将抽象的部分与他们实现的部分分离,使他们都可以独立变化
 * 使用桥接模式的好处在于，如果要增加一种引擎，只需要针对Engine派生一个新的子类，
 * 如果要增加一个品牌，只需要针对RefinedCar派生一个子类，任何RefinedCar的子类都可以和任何一种Engine自由组合，
 * 即一辆汽车的两个维度：品牌和引擎都可以独立地变化
 * 小结:
 * 桥接模式通过分离一个抽象接口和它的实现部分，使得设计可以按两个维度独立扩展。
 * 桥接模式实现比较复杂，实际应用也非常少，但它提供的设计思想值得借鉴，即不要过度使用继承，
 * 而是优先拆分某些部件，使用组合的方式来扩展功能。
 */
public class Main {

    public static void main(String[] args) throws IOException {
        RefinedCar car = new BossCar(new HybridEngine());
        car.drive();
    }


}
