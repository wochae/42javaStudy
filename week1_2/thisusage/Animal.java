package week1_2.thisusage;

public class Animal {

    public String type;
    public Boolean alive;

    public Animal(String type) {
        this.type = type;
    }

    {
        System.out.println("Default Contructor Called.");
        alive = true;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal getMyReference(){
        System.out.println("first");
        return this;
    }
}
