package com.ohgiraffers.oop.chap01.basic2;

/**
 * 생성자(Constructor)
 * - 객체를 만들 때 (new로 호출 시) 처음 실행되는 특수한 메서드이다.
 * - 클래스 이름과 같고, 반환 타입이 없다.
 * - 역할 : 객체의 초기 상태를 설정 (필드 값 초기화)
 */
public class Application {
    public static void main(String[] args) {
        TicketWithoutConstructor ticket = new TicketWithoutConstructor();
        ticket.print();

        System.out.println("======================================");
        MovieTicket movieTicket = new MovieTicket("어벤져스", "9");
        movieTicket.print();
    }
}
