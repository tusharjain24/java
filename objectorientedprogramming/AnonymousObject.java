package objectorientedprogramming;

class VideoPlayer {
    public VideoPlayer() {
        System.out.println("Constructor of class VideoPlayer");
    }

    void display() {
        System.out.println("Display method of class VideoPlayer");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new VideoPlayer().display(); // Anonymous Object
    }
}