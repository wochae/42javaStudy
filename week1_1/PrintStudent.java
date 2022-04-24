package week1_1;

import week1_1.domain.Student;

import java.util.Scanner;

public class PrintStudent {

    public PrintStudent(){

        int idx;
        String name;
        String grade;

        Scanner sc = new Scanner(System.in);

        System.out.println("학번, 이름, 학년을 입력하세요");
        idx = sc.nextInt();
        name = sc.next();
        grade = sc.next();

        Student st = new Student(idx, name, grade);

        System.out.println("학번 : " + idx);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);




    }


}
