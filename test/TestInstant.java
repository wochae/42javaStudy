public class TestInstant {

    public static void main(String[] args) {

        TestInstant testInstant = new TestInstant("first");
        TestInstant testInstant2 = new TestInstant("second");
        TestInstant testInstant3 = new TestInstant("third");
    }

    // 생성자
    public TestInstant(String name) {

        System.out.println("construct : " + name);
    }

    // 인스턴스 초기화 블록
    {
        System.out.println("instant init");
    }

    // 클래스 초기화 블록
    static {
        System.out.println("class init");
    }

}
