package Project12;

public class Song {

    String songName;
    Song next;
    Song previous;

    Song(String songName) {
        this.songName = songName;
        this.next = null;
        this.previous = null;
    }
}