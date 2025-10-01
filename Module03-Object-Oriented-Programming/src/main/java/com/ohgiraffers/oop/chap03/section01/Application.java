package com.ohgiraffers.oop.chap03.section01;

import com.ohgiraffers.oop.chap03.section01.noninheritance.Car;
import com.ohgiraffers.oop.chap03.section01.noninheritance.ElectricCar;

/*
* 상속
*  - 상속은 객체지향 프로그램의 핵심 개념중 하나로, 기존 클래스의 속성과 기능을 새로운 클래스가 물려 받는것을 의미한다.
*  - 자식 클래스는 부모 클래스의 모든 공개 및 보호 필드와 메서드에 접근할 수 있다.
*  - 상속을 통해 코드의 재사용성을 높이고, 공통된 기능을 가진 여러 클래스를 쉽게 관리할 수 있다.
*  - "ElectricCar"클래스는 "Car" 클래스를 상속받아. "Car"클래스의 속성과 메서드를 공유하며,
*  "BatteryLevel"이라는 새로운 속성과 "chargeBattery()"라는 새로운 메서드를 추가한다.
*  - 자식 클래스는 부모 클래스의 메서드를 오버라이드 할 수 있어, 기능을 변화시킬 수 있다.
 */
public class Application {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Honda";
        car.speed = 10000;
        car.accelerate();

        ElectricCar electricCar = new ElectricCar();
        electricCar.brand = "Tesla";
        electricCar.speed = 10000;
        electricCar.accelerate();

        /*
        * 문제점
        * 1. 동일한 코드가 여러 클래스에 중복된다.
        * 2. 변경 사항이 생기면 모든 클래스에서 일일이 수정해야된다.
        * 3. 유지보수성이 낮아진다.
         */
        com.ohgiraffers.oop.chap03.section01.inheritance.Car car1 = new com.ohgiraffers.oop.chap03.section01.inheritance.Car();
        car1.brand = "Honda";
        car1.speed = 10000;
        car1.accelerate();

        com.ohgiraffers.oop.chap03.section01.inheritance.ElectricCar electricCar1 = new com.ohgiraffers.oop.chap03.section01.inheritance.ElectricCar();
        electricCar1.brand = "Tesla";
        electricCar1.speed = 10000;
        electricCar1.batteryLevel = 0;
        electricCar1.model = "model s";

        electricCar1.accelerate();
        electricCar1.chargeBattery();

        /*
        * 상속을 적용.
        * 1. car 클래스는 부모 클래스로 만들고 "ElectricCar"에서 상속을 받는다.
        *  - 이를 통해 Car가 가진 기능을 ElectricCar에서 사용할 수 있게 된다.
        *  - 단 부모의 필드 혹은 메서드에 private로 추가된 속성은 자식이 사용할 수 없다.
         */
    }
}
