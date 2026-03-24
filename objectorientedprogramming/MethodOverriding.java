package objectorientedprogramming;

class Vehicle {
    public void show() {
        System.out.println("Class Vehicle");
    }
}

class Car extends Vehicle {
    public void show() {
        System.out.println("Class Car");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.show();
    }
}
