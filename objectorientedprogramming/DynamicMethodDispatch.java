package objectorientedprogramming;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat is eating");

    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.eat();
        b.eat();
    }
}
/*
 * **Method Overriding** is a compile-time declaration. You write the code in
 * the subclass to redefine the parent's behavior. Without overriding, there is
 * nothing "dynamic" to choose from.
 */

/*
 * **Dynamic Method Dispatch** is the runtime action. It is the specific logic
 * the JVM uses to look at the object type (not the reference type) and map the
 * call to the overridden method.
 */