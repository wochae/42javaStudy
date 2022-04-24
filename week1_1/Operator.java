package week1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operator {

    public Operator() {
        int a;
        int b;
        String c;

        System.out.println("두 수를 입력하시오");
        Scanner sc = new Scanner(System.in);

        try {

            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("사칙 연산을 입력 + - * /");

            c = sc.next();


            switch (c) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("실페 : 잘못된 입력문자");
                    break;
            }

        } catch (InputMismatchException e) {

            System.out.println("알맞은 값을 입력하시오. 처음부터 다시.");

        }

    }
}
