package week1_1.domain;

public class Person {

    private String name;
    private int age;
    private String marital;
    private String gender;
    private int child;



    public Person(String name, int age, String marital, String gender, int child) {
        this.name = name;
        this.age = age;
        this.marital = marital;
        this.gender = gender;
        this.child = child;
    }

    public int getAge() {
        return age;
    }

    public String getMarital() {
        return marital;
    }

    public String getGender() {
        return gender;
    }

    public int getChild() {
        return child;
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

}
