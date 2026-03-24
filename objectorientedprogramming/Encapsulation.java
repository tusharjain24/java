package objectorientedprogramming;

class Human {
    private int age;
    private String name;

    // Default Constructor
    public Human() {
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // setter function: used to set the value of private variables
    public void setAge(int age) {
        this.age = age;
    }

    // getter function: used to get the value of private variables
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        // this: It is a keyword that refers to the current object.
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human(40, "Tushar");
        human.setAge(20);
        human.setName("Tushar");
        System.out.println(human.getAge());
        System.out.println(human.getName());
        System.out.println(human2.getAge());
        System.out.println(human2.getName());
    }
}
