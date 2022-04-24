package week1_1.domain;


public class Student {

    public String name;
    public int idx;
    public String grade;

    public Student() {

    }


    public Student(int idx, String name, String grade) {
        this.idx = idx;
        this.name = name;
        this.grade = grade;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
