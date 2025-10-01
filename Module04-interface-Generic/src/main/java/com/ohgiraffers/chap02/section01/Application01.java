package com.ohgiraffers.chap02.section01;

public class Application01 {
    public static void main (String[] args) {
        ObjectBox stringBox = new ObjectBox();
        stringBox.setItem("hello");

        String box = (String)stringBox.getItem();
        System.out.println(box);

        stringBox.setItem(1234);
        /* String box2 = (Stirng) stringBox.getItem();
        System.out.println(box2); */
    }
}
