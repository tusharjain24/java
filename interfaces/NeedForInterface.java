package interfaces;

interface Computer {
    public void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Desktop is coding faster");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Laptop is coding");
    }
}

public class NeedForInterface {
    public static void main(String[] args) {
        Computer obj1 = new Laptop();
        Computer obj2 = new Desktop();
        Developer dev = new Developer();
        dev.devlopApp(obj1);
        dev.devlopApp(obj2);
    }
}

class Developer {
    public void devlopApp(Computer obj) {
        obj.code();
    }
}
