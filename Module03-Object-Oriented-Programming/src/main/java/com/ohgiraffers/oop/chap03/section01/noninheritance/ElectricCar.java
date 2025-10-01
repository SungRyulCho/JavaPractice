package com.ohgiraffers.oop.chap03.section01.noninheritance;

public class ElectricCar {
    public String brand;
    public int speed;
    public int batteryLevel;

    public void accelerate() {
        speed += 50;
        System.out.println("brand: " + brand + " speed: " + speed);
    }

    public void chargeBattery() {
        batteryLevel  = 100;
        System.out.println("batteryLevel: " + batteryLevel);
    }
}