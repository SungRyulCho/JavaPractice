import java.util.Scanner;
import java.util.Arrays;

/**
 * == ScoreChecker 실습에서 배운 내용 ==

 * 1. 배열과 for문: 사용자에게 배열의 크기와 각 요소를 직접 입력받아 배열을 만들었다.
 * - 배열의 각 위치에 값을 저장해야 하므로 '일반 for문'을 사용했다.

 * 2. 향상된 for문: 저장된 배열을 순회하며 80점 이상인 점수만 출력했다.
 * - 단순히 값을 '읽기'만 하면 되므로 코드가 간결한 '향상된 for문'이 더 적합했다.

 * 3. Scanner 사용법: .nextInt()를 이용해 사용자로부터 정수 값을 입력받는 방법을 익혔다.
 *
 * @author Sung Ryul Cho
 * @version 2025-09-04
 */

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