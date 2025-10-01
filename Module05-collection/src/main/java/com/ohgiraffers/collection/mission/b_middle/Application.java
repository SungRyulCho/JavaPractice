package com.ohgiraffers.collection.mission.b_middle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // 요구사항 1: 로또 번호를 저장할 HashSet<Integer>를 생성하세요.
        HashSet<Integer> lottoNumbers = new HashSet<>();

        // 요구사항 2 & 3: HashSet의 크기가 6이 될 때까지 1~45 사이의 난수를 생성하여 추가하세요.
        Random random = new Random();
        while (lottoNumbers.size() < 6) {
            // 1부터 45 사이의 난수를 하나 생성하세요.
            // 힌트: random.nextInt(45)는 0~44 사이의 수를 반환합니다.
            int randomNumber = random.nextInt(45)+1;// 여기에 코드를 작성하세요.

            // 생성된 난수를 HashSet에 추가하세요.
            // (HashSet이 알아서 중복을 처리해줍니다.)
            // 여기에 코드를 작성하세요.
            lottoNumbers.add(randomNumber);

        }

        // (선택) 정렬 전 HashSet을 출력해 순서가 없는 특징을 확인해보세요.
        System.out.println("정렬 전 HashSet: " + lottoNumbers);

        // 요구사항 4: HashSet을 ArrayList로 변환하세요.
        // 힌트: ArrayList 생성자에 HashSet을 전달하면 쉽게 변환할 수 있습니다.
        ArrayList<Integer> sortedLottoNumbers = new ArrayList<>(lottoNumbers);// 여기에 코드를 작성하세요.

                // 요구사항 5: 변환된 ArrayList를 오름차순으로 정렬하세요.
                // 여기에 코드를 작성하세요.
                Collections.sort(sortedLottoNumbers);

                // 최종 결과 출력
                System.out.println("최종 로또 번호: " + sortedLottoNumbers);
    }
}