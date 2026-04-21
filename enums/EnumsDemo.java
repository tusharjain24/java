package enums;

/*
1. Enum is a named constant.
2. Internally enum is a class itself and the values inside enum are objects
*/

enum Laptop {
    Apple(2000, "MacBook Pro M4"), HP(1200, "Pavalion"), DELL(1800, "XPS"), LENOVO(1500, "ThinkPad");

    private int price;
    private String laptopName;

    /*
     * By default, there is a constructor called for each enum constant with no
     * arguments.
     * 
     * If we define a constructor with arguments, we have to define a default
     * constructor as well.
     */
    private Laptop() {
    }

    private Laptop(int price, String laptopName) {
        this.price = price;
        this.laptopName = laptopName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }
}

enum STATUS {
    NOT_STARTED, RUNNING, STOPPED, SUSPENDED, INVALID
}

public class EnumsDemo {
    public static void main(String[] args) {
        STATUS s = STATUS.RUNNING;
        /*
         * To print the value of the enum we have to use .name() method or directly use
         * s which internally calls .name() method
         */
        System.out.println(s);

        /*
         * Returns the index of the enum value
         */
        System.out.println(s.ordinal());

        /*
         * Print all the values of the enum
         */
        for (STATUS eachStatus : STATUS.values()) {
            System.out.println(eachStatus + " : " + eachStatus.ordinal());
        }

        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + " -> Price : " + laptop.getPrice() + " -> " + laptop.getLaptopName());
        }
    }

}
