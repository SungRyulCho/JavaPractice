package com.ohgiraffers.oop.chap01.basic;

public class Application {
    public static void main(String[] args) {
        String brand = "Tesla";
        String model1 = "Model s";
        int speed1 = 0;

        String brand2 = "BMW";
        String model2 = "i5";
        int speed2 = 0;

//        System.out.println("Brand: " + brand + ", Model: " + model1 + ", Speed: " + speed1);
//        System.out.println("Brand2: " + brand2 + ", Model: " + model2 + ", Speed: " + speed2);

        /**
         * 문제점
         * 1. 데이터가 흩어져있다 : brand, model, speed는 논리적으로 하나의 묶음이지만, 코드 상으로 뿔뿔이 흩어져있다.
         * 2. 관리의 어려움 : 자동차 100대가 되면, 100개의 브랜ㄷ, 모델, 속도 변수를 모두 따로 관리해야한다.
         * 3. 실수 유발 : car brand와 car2 speed를 사용하는 실수를 해도 문법적인 오류가 없다.
         */

        /**
         * [new 연산자]
         * - new는 클래스의 설계도를 바탕으로 실제 객체(인스턴스)를 메모리(힙 영역)에 만들어내는 명령어.
         * - new Car()는 car의 설계도를 보고 실제 자동차 한 대를 생산해 라는 의미이다.
         *
         * car 변수 (참조 변수)
         * - car는 방금 만들어진 car 객체가 메모리 어디에 있는지 주소(참조)를 저장하는 변수이다.
         * - 마치 자동차 열쇠처럼 이 변수를 통해 실제 객체에 접근하고 조작할 수 있다.
         */

        // new 선언 시 stack에는 주소값이 저장되어 heap 메모리를 호출한다. (초기화 이후)
//        Car car = new Car();

        /**
         * 인스턴스 참조
         * - car는 Car 객체의 주소를 가지고 있으며 '.'(참조연산자)는 이것을 참조한다고 한다.
         * - car를 통해 객체의 속성 (Brand, Model, Speed)나 기능(accel, break)를 사용할 수 있다.
         */
//        car.brand = "Tesla";
//        car.model = "Model s";
//        car.speed = 0;

        Car car = new Car(brand, model1, speed1);
        car.accel();
        car.accel();
        car.break1();

        System.out.println("car 현재 속도 : " + car.getSpeed());
    }
}
