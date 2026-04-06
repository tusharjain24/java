package abstractclass;

abstract class FourWheelers {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing Music ...");
    }
}

class WagonR extends FourWheelers {
    public void drive() {
        System.out.println("WagonR is driving");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        FourWheelers car = new WagonR();
        car.drive();
        car.playMusic();
    }
}
