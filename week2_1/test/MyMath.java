package week2_1.test;

public class MyMath {
    long a, b;

    // 인스턴스 변수 a, b만을 이용해 작업하므로 매개변수가 필요없다.
    long add() { return a + b; } // a, b는 인스턴스 변수

    // even though no instant variables, only deal with parameters.
    static long add(long a, long b) { return a + b; }
}

class MyMathTest {
    public static void main(String[] args) {

        // Class Method called
        System.out.println(MyMath.add(200L, 200L));

        // Method of Instance' call could be after Instantiation
        MyMath mm = new MyMath();
        mm.a = 200L;
        mm.b = 200L;
        System.out.println(mm.add());

        // If We don't need instant var, Considering attaching static keyword to effectively decrease method call time.
    }
}
