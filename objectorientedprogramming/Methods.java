package objectorientedprogramming;

class MusicPlayer {
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    public String getMusic(String genre) {
        String musicName;
        switch (genre) {
            case "COUNTRY":
                musicName = "Old Town Road";
                break;
            case "ROCK":
                musicName = "Summer of 69";
                break;
            case "POP":
                musicName = "Blinding Lights";
                break;
            default:
                musicName = "We have not yet added the any songs of this genre, we will add more later on.";
                break;

        }
        return musicName;
    }
}

public class Methods {
    public static void main(String[] args) {
        MusicPlayer object = new MusicPlayer();
        String userSelectedGenre = "ROCK";
        object.playMusic();
        String musicCategory = object.getMusic(userSelectedGenre);
        System.out.println("Genre: " + musicCategory);
    }
}
