package com.ohgiraffers.collection.mission.a_basic;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {



    // 요구사항 1: 필드 선언
    // Task 객체들을 저장할 private List<Task>와,
    // 다음 작업 ID를 저장할 private int 변수를 선언하세요. (초기값 1)
    private List<Task> taskList;
    private int nextTaskId = 1;

    // 요구사항 2: 생성자
    // 생성자에서 Task 리스트를 ArrayList로 초기화하세요.
    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    // 요구사항 3: addTask 메서드
    // public void addTask(String content)
    // content를 매개변수로 받아 새로운 Task 객체를 생성합니다.
    // 생성된 Task 객체를 리스트에 추가하고, 다음 ID 값을 1 증가시킵니다.
    public void addTask(String content) {
        // 여기에 코드를 작성하세요.
        Task newTask = new Task(nextTaskId, content);
        this.taskList.add(newTask);
        nextTaskId++;
    }

    public Task findTask(int id) {
        // 여기에 'id'와 일치하는 Task 객체를 찾아서 반환하는 코드를 작성하세요.
        // for-each 문으로 taskList를 순회하고,
        // if 문으로 task.getId()와 id가 같은지 비교합니다.
        // 같다면 해당 task를 즉시 return 하세요.
        for(Task task:this.taskList) {
            if(task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    // 요구사항 4: removeTask 메서드
    // public void removeTask(int id)
    // id를 매개변수로 받아 리스트에서 일치하는 id를 가진 Task를 찾아 삭제합니다.
    // 힌트: 삭제할 객체를 먼저 찾은 후, 리스트의 remove() 메서드를 이용해 삭제하세요.
    public void removeTask(int id) {
        // 여기에 코드를 작성하세요.
        Task taskToRemove = findTask(id);
        if(taskToRemove !=null) {
            this.taskList.remove(taskToRemove);
        }
    }

    // 요구사항 5: printAllTasks 메서드
    // public void printAllTasks()
    // 리스트에 있는 모든 Task의 정보를 출력합니다.
    public void printAllTasks() {
        // 여기에 코드를 작성하세요.
        System.out.println("--- 전체 할 일 목록 ---");
        for(Task task : this.taskList) {
            System.out.println(task);
        }
        System.out.println("--------------------");



    }
}