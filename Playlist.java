package Project12;

public class Playlist {

    Song head = null;
    Song tail = null;

    // Add Song
    void addSong(String name) {

        Song newSong = new Song(name);

        if(head == null) {
            head = tail = newSong;
        }
        else {
            tail.next = newSong;
            newSong.previous = tail;
            tail = newSong;
        }

        System.out.println(name + " added to playlist");
    }

    // Display Playlist
    void displaySongs() {

        if(head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        Song temp = head;

        System.out.println("\nPlaylist:");

        while(temp != null) {
            System.out.println(temp.songName);
            temp = temp.next;
        }
    }

    // Delete Song
    void deleteSong(String name) {

        Song temp = head;

        while(temp != null) {

            if(temp.songName.equals(name)) {

                // Head Node
                if(temp == head) {
                    head = head.next;

                    if(head != null)
                        head.previous = null;
                }

                // Tail Node
                else if(temp == tail) {
                    tail = tail.previous;
                    tail.next = null;
                }

                // Middle Node
                else {
                    temp.previous.next = temp.next;
                    temp.next.previous = temp.previous;
                }

                System.out.println(name + " deleted");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Song not found");
    }
}