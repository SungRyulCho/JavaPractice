package com.ohgiraffers.oop.chap01.basic;

/**
 * 클래스 및 객체의 개념
 * <p>
 * [클래스란?]
 * - 객체를 생성하기 위한 설계도
 * - 변수(필드_속성)와 메서드(기능_행위)을 포함한다.
 * <p>
 * [객체란?]
 * - 단순한 데이터 덩어리(VO)가 아닌 스스로 상태(State)를 책임지는 행위(Behavior)의 주체이다.
 * - 객체는 현실 세계의 사물을 모방하는 것이 아니라, 특정 "책임"을 수행하는 역할(Role)을 부여받은 존재이다.
 * <p>
 * [좋은 객체 설계의 시작]
 * - 이 객체가 어떤 데이터를 가지는가? 가 아닌, 이 객체가 어떤 책임을 수행해야 하는가?를 먼저 질문해야한다.
 * - Car 객체의 책임은 이동하는 것이다. 따라서 외부에서 속도를 직접 제어하는 것이 아니라,
 * 가속, 감속에 대한 메세지를 보내 책임을 수행할 수 있도록 요청해야 한다. (캡슐화)
 * <p>
 * [문법 구조]
 * class 클래스이름 {
 * // 필드(속성)
 * // 메서드 (기능)
 * }
 */
public class Car {
    private String brand;
    private String model;
    private int speed;
    private boolean status;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accel() {
        speed += 10;
        if (speed > 10) status = true;
        System.out.println("Brand: " + brand + ", Model: " + model + ", Speed: " + speed + ", Status: " + status);
    }

    public void break1() {
        speed -= 10;
        if (speed <= 0) status = false;
        System.out.println("Brand: " + brand + ", Model: " + model + ", Speed: " + speed + ", Status: " + status);
    }

    public int getSpeed() {
        return speed;
    }
}
