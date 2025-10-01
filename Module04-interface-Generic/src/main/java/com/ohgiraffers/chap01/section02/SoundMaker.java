package com.ohgiraffers.chap01.section02;

/**
 * 인터페이스 (Interface)
 * 역할을 정의하는 '계약' 또는 '규약'
 * * 인터페이스란?
 * 객체가 수행해야 할 역할(Role)이나 행동(Behavior)을 정의하는 순수한 계약입니다.
 * - '무엇을 할 수 있는지'를 정의하지만, '어떻게 하는지'는 정의하지 않습니다.
 * (구현 클래스가 그 책임을 가짐)
 * - 코드를 작성하지 않고, 메서드의 시그니처(이름, 매개변수, 반환 타입)만 작성합니다.
 * - 'implements' 키워드를 사용하여 여러 인터페이스, 즉 여러 역할을 동시에 수행할 수 있습니다.
 * * 인터페이스 vs. 추상 클래스
 * - 추상 클래스: 'is-a' 관계 (종족의 개념)
 * "A는 B의 한 종류이다." 예: Dog is a Animal (개는 동물이다).
 * - 인터페이스: 'can-do' 관계 (역할의 개념)
 * "A는 B를 할 수 있다." 예: Bird can do Flyable (새는 날 수 있다).
 * * 인터페이스의 주요 특징
 * 1. 모든 메서드는 자동으로 public abstract로 간주됩니다.
 * 2. 모든 필드는 자동으로 public static final로 간주되어 상수로 취급됩니다.
 * 3. 다중 상속을 지원하여 여러 인터페이스를 구현할 수 있습니다.
 * 4. 서로 다른 클래스 간의 공통된 기능을 정의하여 코드의 재사용성을 높입니다.
 */
public interface SoundMaker {
    public final int DECIBEL = 5;

    public void makeSound();
}
