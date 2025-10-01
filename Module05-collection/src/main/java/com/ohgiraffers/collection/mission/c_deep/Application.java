package com.ohgiraffers.collection.mission.c_deep;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        String text = "Java is a high-level, class-based, object-oriented programming language. " +
                "Java is designed to have as few implementation dependencies as possible.";

        // 요구사항 1: 단어 빈도수를 저장할 HashMap<String, Integer>를 생성하세요.
        HashMap<String, Integer> wordCounts = new HashMap<>();

        // 요구사항 2: 주어진 문자열을 공백 기준으로 단어로 분리하세요. (String 배열)
        String[] words = text.split("\\s+");// 여기에 코드를 작성하세요.

        // 요구사항 3 & 4: 각 단어를 순회하면서 처리합니다.
        for (String word : words) {
            // 여기에 코드를 작성하세요.
            // 3-a: 단어를 소문자로 변환하고, 알파벳 이외의 문자를 모두 제거하세요.
            String processedWord = word.toLowerCase().replace("[^a-z]", "");

            // 3-b: 처리된 단어가 비어있지 않은 경우에만 계산합니다.
            if (!processedWord.isEmpty()) {
                // 4: HashMap에 단어의 빈도수를 기록하세요.
                // 힌트: getOrDefault(key, defaultValue) 메서드를 사용하면 코드를 간결하게 만들 수 있습니다.
                // processedWord가 이미 맵에 있으면 기존 카운트 값을, 없으면 0을 가져온 뒤 +1을 합니다.
                // 여기에 코드를 작성하세요.
                wordCounts.put(processedWord, wordCounts.getOrDefault(processedWord, 0) + 1);
            }
        }

        // 요구사항 5: HashMap에 저장된 모든 단어와 빈도수를 출력하세요.
        System.out.println("--- 단어 빈도수 ---");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            // entry.getKey()로 단어를, entry.getValue()로 빈도수를 가져올 수 있습니다.
            // 여기에 "단어: 빈도수" 형태로 출력하는 코드를 작성하세요.
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}