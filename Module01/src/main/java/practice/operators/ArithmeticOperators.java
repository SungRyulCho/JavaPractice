package practice.operators;
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("덧셈 결과: " + (num1 + num2));
        System.out.println("뺄셈 결과: " + (num1 - num2));
        System.out.println("나눗셈 결과: " + (num1 /num2));
        System.out.println("곱셈 결과: " + (num1 * num2));
        System.out.println("나머지 결과: " + (num1 % num2));
    }
}
