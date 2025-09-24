package practice.conditionalstatement;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험 점수(0-100)를 입력하세요: ");
        int score = sc.nextInt();
        if(score >= 90) {
            System.out.println("A 학점입니다");
        }else if(score >= 80 && score < 90) {
            System.out.println("B 학점입니다");
        }else if(score >= 70 && score < 80) {
            System.out.println("C 학점입니다");
        }else if(score >= 60 && score < 70) {
            System.out.println("D 학점입니다");
        }else {
            System.out.println("F 학점입니다");
        }
        sc.close();
    }
}
