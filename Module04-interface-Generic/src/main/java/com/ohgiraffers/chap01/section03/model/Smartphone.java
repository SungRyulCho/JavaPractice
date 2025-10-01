package com.ohgiraffers.chap01.section03.model;

public class Smartphone extends PortableDevice implements Rechargeable {
    public Smartphone(String model) {
        super(model);
    }

    @Override
    public void recharge() {
            System.out.println(super.getModel() + "디바이스 충전중");
    }
}
