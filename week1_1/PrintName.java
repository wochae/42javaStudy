package week1_1;

import week1_1.domain.Person;

public class PrintName {

    public PrintName(String name) {

        Person p = new Person(name);

        System.out.println(p.getName());
    }
}
