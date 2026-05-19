package Project12;

 public class Main {

    public static void main(String[] args) {

        Playlist p = new Playlist();

        p.addSong("Shape of You");
        p.addSong("Believer");
        p.addSong("Perfect");
        p.addSong("Faded");

        p.displaySongs();

        p.deleteSong("Perfect");

        p.displaySongs();
    }
}