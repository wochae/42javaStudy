package week1_1.student;

import week1_1.student.Student;

import java.util.Scanner;

public class PrintStudent {
    private final Student student;

    public PrintStudent(Student student) {
        this.student = student;
    }

    public void exec() {
        System.out.println("--------PrintStudentExec---------\n");

        System.out.println("학번 : " + student.getNum());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getStudentYear() + "학년");
    }

    public void exec2() {
        System.out.println("--------PrintStudentExec2---------\n");
        Student studentLee = new Student();
        studentLee.setName("이순신");
        System.out.println("studentLee = " + studentLee);

    }

//
//        int idx;
//        String name;
//        String grade;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("학번, 이름, 학년을 입력하세요");
//        idx = sc.nextInt();
//        name = sc.next();
//        grade = sc.next();
//
//        Student st = new Student(idx, name, grade);
//
//        System.out.println("학번 : " + idx);
//        System.out.println("이름 : " + name);
//        System.out.println("학년 : " + grade);
//


}


