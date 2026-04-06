# Abstract Class

## Introduction
- An `Abstract Class` is a class that is declared with the `abstract` keyword.
- It can have both abstract and concrete methods.
- It cannot be instantiated. Instead we can create a reference of the abstract class and assign it to a concrete class object.
```java
abstract class FourWheelers {
    public abstract void drive();
}

class WagonR extends FourWheelers {
    public void drive() {
        System.out.println("WagonR is driving");
    }
}
```
- In the above example, `FourWheelers` is an abstract class and `WagonR` is a concrete class.
- `FourWheelers` has an abstract method `drive()` which is implemented by `WagonR`.
- We have to define all the abstract methods of an abstract class otherwise it will throw an error. In case we don't define one we have to make the child class abstract as well.
```java
abstract class FourWheelers {
    public abstract void drive();
    public abstract void changeTire();
}

abstract class WagonR extends FourWheelers {
    public void drive() {
        System.out.println("WagonR is driving");
    }
}
```
**Note**: In the above example `WagonR` is an abstract class because it has an abstract method `changeTire()` which is not implemented by it. To use both the methods we have create another child class that implements WagonR and defines `changeTire()` method.
```java
class UpdateWagonR extends WagonR {
    public void changeTire() {
        System.out.println("WagonR is changing tire");
    }
}
```
