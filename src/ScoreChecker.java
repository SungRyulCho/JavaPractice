import java.util.Scanner;
import java.util.Arrays;

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 배열 크기 입력받기(학생 수)
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();
        // 2. 입력받은 크기로 배열 생성
        int[] scores = new int[studentCount];

        // 3. 일반 for문을 사용해 각 학생의 점수 입력받기
        System.out.println(studentCount + "명의 점수를 입력하세요:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        System.out.println("--- 입력된 전체 점수 ---");
        System.out.println(Arrays.toString(scores)); //전체 점수 확인

        System.out.println("--- 80점 이상 합격 점수 ---");
        // 4. 향상된 for문을 사용해 80점 이상인 점수만 출력하기
        for (int score : scores) {
            if(score >= 80) {
                System.out.print(score + " ");
            }
        }
    }
}