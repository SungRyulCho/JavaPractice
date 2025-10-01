package com.ohgiraffers.collection.mission.a_basic;

public class Application {
    public static void main(String[] args) {

        // 요구사항 1: TaskManager 인스턴스를 생성하세요.
        // 여기에 코드를 작성하세요.
        TaskManager manager = new TaskManager();


        // 요구사항 2: 생성한 인스턴스를 사용해 할 일을 3개 추가하세요.
        // "자바 공부하기", "점심 먹기", "운동하기"
        // 여기에 코드를 작성하세요.
        manager.addTask("자바 공부하기");
        manager.addTask("점심 먹기");
        manager.addTask("운동하기");

        // 요구사항 3: 전체 할 일 목록을 출력하세요.
        // 여기에 코드를 작성하세요.
        System.out.println(">> 할 일 3개 추가 후 목록: ");
        manager.printAllTasks();

        // 요구사항 4: ID를 이용해 할 일을 1개 삭제하세요. (예: ID 2번 "점심 먹기")
        // 여기에 코드를 작성하세요.
        manager.removeTask(2);

        // 요구사항 5: 삭제 후, 전체 할 일 목록을 다시 출력해서 확인하세요.
        // 여기에 코드를 작성하세요.
        System.out.println("\n>> ID가 2인 할 일 삭제 후 목록: ");
        manager.printAllTasks();

        // --- findTask 기능 테스트 ---
        System.out.println("\n>> ID가 3인 할 일 찾기 테스트:");
        // 여기에 ID가 3인 Task를 찾아 그 내용을 출력하는 코드를 작성하세요.
        // 찾은 Task가 null이 아닐 경우에만 출력해야 합니다.
        Task foundTask1 = manager.findTask(3);
        if (foundTask1 != null) {
            System.out.println("찾은 할 일: " + foundTask1);
        }

        System.out.println("\n>> ID가 99인 할 일 찾기 테스트 (없는 ID):");
        // 여기에 ID가 99인 Task를 찾아 출력하는 코드를 작성하세요.
        // 찾은 Task가 null일 경우 "찾는 할 일이 없습니다." 라고 출력하세요.
        Task foundTask2 = manager.findTask(99);
        if (foundTask2 == null) {
            System.out.println("찾는 할 일이 없습니다.");
        }
    }
}