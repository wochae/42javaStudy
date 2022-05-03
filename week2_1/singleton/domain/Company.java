package week2_1.singleton.domain;

public class Company {
    private static Company uniqueInstance;

    private Company() {}

    public static synchronized Company getInstance() {
        // getInstance에 synchronized 키워드만 추가하면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다린다.
        // 즉, 두 스레드가 이 메소드를 동시에 실행시키는 일은 일어나지 않게 됨.
        System.out.println("start");
        if (uniqueInstance == null) {
            System.out.println("if statement session");
            uniqueInstance = new Company();
        }
        return uniqueInstance;
    }


}
