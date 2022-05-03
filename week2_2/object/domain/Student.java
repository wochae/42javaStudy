package week2_2.object.domain;

import java.util.ArrayList;

public class Student {
    private Integer idx;
    private String name;
    private ArrayList<Subject> subjectList;



    public Student(Integer idx, String name) {
        this.idx = idx;
        this.name = name;

        subjectList = new ArrayList<Subject>(); // 멤버 초기화 해줘야함.
    }


    public void addSubject(String name, Integer grade) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setGrade(grade);

        subjectList.add(subject);
    }


    public void showStudentInfo() {
        Integer sum;

        sum = 0;
        for(Subject subject: subjectList) {
            System.out.println("학생 " + name + "님의 " + subject.getName() + "의 성적은 : " + subject.getGrade() + "입니다.");
            sum += subject.getGrade();
        }
        System.out.println(name + "의 총점은 " + sum);
    }
}
