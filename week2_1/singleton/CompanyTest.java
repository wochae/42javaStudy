package week2_1.singleton;

import week2_1.singleton.domain.Company;

public class CompanyTest {

    public static void main(String[] args) {

        Company myCompany1 = Company.getInstance();
        System.out.println("between");
        Company myCompany2 = Company.getInstance();

//        Company company = new Company(); // 에러가 발생한다. public이 아닌 private으로 하기 때문

        System.out.println( myCompany1 == myCompany2);
    }

}
