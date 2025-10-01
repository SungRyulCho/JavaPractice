package com.ohgiraffers.chap01.section03.model;

public interface Rechargeable {
    void recharge();

    default void checkBattery() {
        System.out.println("기본 베터리 상태 점검");
    }
}
