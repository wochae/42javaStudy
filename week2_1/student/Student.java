package week2_1.student;

public class Student {
    private static int serialNum =10000;

    public Integer studentID;
    public String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        /*
        int i = 10; // 지역변수는 가능하다. 함수 내부에서 존재하기 때문

        i++;
        System.out.println(i);

        studentName = "홍길동"; // 멤버변수 ( 인스턴스 변수 )기 때문에 static을 붙이는게 아니라면 에러 발생한다.
        핵심은 클래스는 인스턴스 생성 필요 없이 멤버에 참조할 수 있기 때문에 클래스.멤버 해서 접근할 수 있지만
        static이 없는 메소드나 변수들은 인스턴스를 생성하고 나서 다룰 수 있기 때문에 ( 또한 런타임, 즉 시점도 다르다.)
         */
        return serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
