package com.ohgiraffers.collection.mission.a_basic;

public class Task {
    // 요구사항 1: 필드 선언
    // private 접근제어자로 int 타입의 id와 String 타입의 content를 선언하세요.
    private int id;
    private String content;

    // 요구사항 2: 생성자
    // id와 content를 매개변수로 받아 필드를 초기화하는 생성자를 만드세요.
    public Task(int id,String content) {
        this.id = id;
        this.content = content;
    }

    // 요구사항 3: Getter 메서드
    // id와 content 필드에 대한 getter 메서드를 각각 만드세요.
    public int getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    // 요구사항 4: toString() 메서드 (선택)
    // 객체의 내용을 쉽게 출력하기 위해 toString() 메서드를 오버라이딩하세요.
    // 예시 출력: "ID: 1, 내용: 자바 공부하기"
    @Override
    public String toString() {
        return "ID: " + id + ", 내용:" + content;
    }


}