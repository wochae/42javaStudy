package week2_1.student;

public class StudentTest {

    public static void main(String args[]){
        System.out.println(Student.getSerialNum()); // class 멤버 변수가 맨 처음 초기화 한 값.

        Student studentLee = new Student(); // 인스턴스 생성
        studentLee.setStudentName("이순신");
        System.out.println(Student.getSerialNum()); // 생성자 초기화로 변경된 클래스 변수를 참조
        System.out.println(studentLee.getStudentName() + "학번 : " + studentLee.studentID);

        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");
        System.out.println(Student.getSerialNum());
        System.out.println(studentSon.studentName + "학번 : " + studentSon.studentID);
    }

}
