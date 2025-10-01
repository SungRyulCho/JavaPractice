package com.ohgiraffer.jdbc;

import com.ohgiraffer.jdbc.config.JDBCConnection;
import com.ohgiraffer.jdbc.model.Course;
import com.ohgiraffer.jdbc.service.CourseService;
import com.ohgiraffer.jdbc.util.QueryUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Connection connection = JDBCConnection.getConnection();
            System.out.println(QueryUtil.getQuery("course.save"));

            System.out.println();

            System.out.println("Connection: " + connection);
            System.out.println("Database successfully connected!");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("======== 기초 실습 1 ========");
                System.out.println("======== 기초 실습 2 ========");
                int num = scanner.nextInt();
                if (num == 1) {
                    runBeginnerExercise(connection);
                } else if (num == 2) {
                    runIntermediateExercise(connection);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 전체 과정을 조회하고 출력한다
     * @param connection DB Connection 객체
     * @throws SQLException
     */
    public static void runBeginnerExercise(Connection connection) throws SQLException {
        CourseService courseService = new CourseService(connection);
        List<Course> courses = courseService.courseFindAll();

        for (Course course: courses) {
            System.out.println(course);
        }
    }

    public static void runIntermediateExercise(Connection connection) throws SQLException {
        System.out.println("====== 중급 실습 콘텐츠 모듈 CRUD ======");
        CourseService courseService = new CourseService(connection);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== 작업을 선택해주세요 ====");
            System.out.println("== 1. 과정 등록 ==");
            System.out.println("== 2. 단일 과정 조회 ==");
            System.out.println("== 3. 과정 수정 ==");
            System.out.println("== 4. 과정 삭제 ==");
            System.out.println("== 5. 이전으로 돌아가기 ==");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                System.out.println("과정명을 입력해주세요: ");
                String title = scanner.nextLine();
                System.out.println("과정 설명을 입력해주세요: ");
                String description = scanner.nextLine();
                Course course = new Course(1L, title, description, "draft");
                System.out.println("[등록] course = " + course);
                long result = courseService.courseSave(course);
                if (result > 0) {
                    System.out.println("==== 모듈 등록 성공 ====");
                } else {
                    System.out.println("==== 모듈 등록 실패 ====");
                }
            }else if (num == 2) {
                System.out.println("조회할 과정 번호: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                Course foundModule = courseService.findCourse(id);
                System.out.println("모듈 조회 결과: " + foundModule);
            }else if (num == 3) {
                System.out.println("수정할 과정 번호를 입력해주세요");
                long id = scanner.nextLong();
                scanner.nextLine();

                System.out.println("새로운 과정명을 입력해주세요");
                String newTitle = scanner.nextLine();

                System.out.println("새로운 과정 설명을 입력해주세요");
                String newDescription = scanner.nextLine();

                int result = courseService.updateCourse(id,newTitle,newDescription);

                if (result > 0) {
                    System.out.println("과정 수정 성공");
                    Course updatedCourse = courseService.findCourse(id);
                    System.out.println("수정 후 과정:" + updatedCourse);
                }else{
                    System.out.println("log: 과정 수정 실패.");
                }
            }else if (num == 4) {
                // 1. 삭제할 번호를 입력해주세요 -> 번호
                System.out.println("삭제할 과정 번호를 입력해주세요 : ");
                long id = scanner.nextLong();
                scanner.nextLine();

                // 2. 서비스에 넘겨준다.
                // 전: 입력 받기, 후: 반환값(int)
                if(id > 0) {
                    int result = courseService.deletedCourse(id);
                    // 3. 삭제 여부 확인
                    if(result > 0) {
                        // 성공시
                        System.out.println("삭제 성공 삭제 id: " + id);
                    }else{
                        // 실패시
                        System.out.println("삭제 실패 id: " + id);
                    }
                }else{
                    // 값이 없을 경우
                    System.out.println("Error: 값을 다시 입력해주세요.");
                }
            }

        }
    }

}
