package week1_2.domain;

public class Studnet {

    int studentID;
    String studentName;

    public Subject korea;
    public Subject math;


    public Studnet(int studentID, String studentName) {

        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setKorean(String subjectName, int subjectScore){
        korea.subjectName = subjectName;
        korea.subjectScore = subjectScore;
    }
    public void setMath(String subjectName, int subjectScore){
        math.subjectName = subjectName;
        math.subjectScore = subjectScore;
    }

    public Subject getKorean() {
        return korea;
    }

    public Subject getMath() {
        return math;
    }


    public void showStudentInfo() {
        System.out.println("학생 " + getStudentName() + "의 총점은 " + (getKorean().subjectScore + getMath().subjectScore) + "입니다.");
    }
}
