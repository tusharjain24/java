package objectorientedprogramming;

class Mobile {
    String brand;
    String name;
    float price;
    // static variable
    static String MobileType;

    // static block
    static {
        MobileType = "Smart Phone";
        System.out.println("Static Block Called");
    }

    // constructor
    public Mobile() {
        brand = "";
        name = "";
        price = 0.00f;
        System.out.println("Constructor Called");
    }

    public void displayMobile() {
        System.out.println(brand + " " + name + ": " + price + "$ " + MobileType);
    }

    // static method
    public static void changeMobileType(Mobile item) {

        MobileType = "Touch Screen Phone";
        /*
         * static method can only access static variables and cannot access non-static
         * variables
         */
        // System.out.println(brand + " " + name + ": " + price + "$ " + MobileType);

        /*
         * We can access non-static variables by passing the object of the class as a
         * parameter to the static method
         */
        System.out.println(item.brand + " " + item.name + ": " + item.price + "$ " + MobileType);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Mobile item1 = new Mobile();
        item1.brand = "Apple";
        item1.name = "Iphone 16";
        item1.price = 160.99f;

        Mobile item2 = new Mobile();
        item2.brand = "Samsung";
        item2.name = "Galaxy S Fold";
        item2.price = 158.99f;

        Mobile item3 = new Mobile();

        // Mobile Type can be access directly using the Class name
        System.out.println(Mobile.MobileType);

        item1.displayMobile();
        item2.displayMobile();
        System.out.println("Default values of Mobile Class");
        item3.displayMobile();
        Mobile.changeMobileType(item1);
    }
}

/*
 * In Java, the class is first loaded in the JVM and then the Object is created.
 * 
 * When the class is loaded in the JVM, the static block is executed.
 * 
 * When the object is created, the constructor is executed.
 * 
 * Static block is executed only once when the class is loaded in the JVM.
 * 
 * Constructor is executed every time the object is created.
 * 
 * Static variables are shared among all the objects of the class.
 * 
 * Non-static variables are not shared among all the objects of the class.
 */

/*
 * To load a class in JVM, we can use the Class.forName() method.
 * eg:
 * ```
 * Class.forName("Mobile");
 * ```
 * 
 * 
 */
