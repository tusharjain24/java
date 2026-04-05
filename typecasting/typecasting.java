package typecasting;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class typecasting {
    public static void main(String[] args) {
        // 1. Implicit Typecasting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Implicit Casting:");
        System.out.println("int value: " + myInt);
        System.out.println("double value: " + myDouble);
        System.out.println();

        // 2. Explicit Typecasting (Narrowing)
        double myOtherDouble = 9.78d;
        int myOtherInt = (int) myOtherDouble; // Manual casting: double to int
        System.out.println("Explicit Casting:");
        System.out.println("double value: " + myOtherDouble);
        System.out.println("int value: " + myOtherInt);
        System.out.println();

        // 3. Upcasting (Implicit)
        System.out.println("Upcasting:");
        Dog myDog = new Dog();
        Animal myAnimal = myDog; // Upcasting: Dog to Animal
        myAnimal.makeSound(); // myAnimal can access Animal methods
        // myAnimal.bark(); // Error: myAnimal cannot access Dog-specific methods
        System.out.println();

        // 4. Downcasting (Explicit)
        System.out.println("Downcasting:");
        Animal anotherAnimal = new Dog(); // First upcast to establish the object as a Dog
        Dog anotherDog = (Dog) anotherAnimal; // Explicitly cast Animal back to Dog
        anotherDog.makeSound();
        anotherDog.bark(); // Now we can access Dog-specific methods
    }
}
