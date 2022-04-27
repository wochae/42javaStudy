package week1_1;
import week1_1.operator.OperatorTest;
import week1_1.person.Gender;
import week1_1.person.Married;
import week1_1.person.Person;
import week1_1.printname.PrintNameTest;
import week1_1.student.PrintStudent;
import week1_1.student.Student;

public class Main {

    public static void main(String args[]) {

        PrintNameTest printNameTest = new PrintNameTest();
        printNameTest.test();

        OperatorTest operatorTest = new OperatorTest();
        operatorTest.test();

        PrintStudent printStudent = new PrintStudent(new Student(1001L, "홍길동", 2));
        printStudent.exec();
        printStudent.exec2();

        Person person = new Person("제인", 30, Gender.여성, Married.기혼자, 1);
        person.print();

        Person person2 = new Person();
        person2.setName("제인");
        person2.setAge(30);
        person2.setGender(Gender.여성);
        person2.setMarried(Married.기혼자);
        person2.setChild(1);
        person2.print();







        // 이름 호출하기
        // PrintName pn = new PrintName("홍길동");


        // 두 수를 이용하여 사칙연산을 하는 클래스
        // Operator op = new Operator();

        // 학생 클래스를 만들고 생성하기
        // PrintStudent ps = new PrintStudent();

        // 참조변수와 참조값
        /*
        Student studentLee = new Student();
        studentLee.name = "이순신";
        System.out.println(studentLee);
        */

        // 매개변수로 받는 생성자 ( 오버로딩된 생성자 )
        /*
        PrintInfo pi = new PrintInfo();
        System.out.println("사람이 있습니다.");
        System.out.println("이름은 " + pi.name + ", 나이는 " + pi.age + "세 입니다.");
        System.out.print(pi.gender + "이고, ");
        if (pi.marital == "true") {
            System.out.print("기혼자이며, ");
        } else {
            System.out.print("기혼자가 아니며, ");
        }
        System.out.println("자녀는 " + pi.child + " 명이 있습니다.");
        */


    }
}
