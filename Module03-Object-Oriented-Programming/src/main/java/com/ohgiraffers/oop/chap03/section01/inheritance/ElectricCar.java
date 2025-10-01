package com.ohgiraffers.oop.chap03.section01.inheritance;

/*
* 상속
*  - electricCar 가 Car를 상속 받으면 car의 모든 필드와 메서드를 물려받아 재사용할 수 있다.
*  - 이는 객체지향에서 "electricCar"는 car의 한 종류이다 라는 is-a 라고 표현한다.
*  - 이를 통해 코드 중복을 제거하고, 역할을 더욱 전문화할 수 있다.
 */

public class ElectricCar extends Car {

    public int batteryLevel;

    public ElectricCar(){
        super();
    }


    public void chargeBattery(){
        batteryLevel = 100;
        System.out.println("브랜드 명 : " + super.brand + "batteryLevel: " + this.batteryLevel);
    }

}
