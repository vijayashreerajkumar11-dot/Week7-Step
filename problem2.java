class Playlist {

    private String[] songs;
    private int songCount;

    // Constructor
    Playlist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    // Add a song
    void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        } else {
            System.out.println("Playlist is full!");
        }
    }

    // Return a copy of the songs
    String[] getSongs() {
        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    // Read-only song count
    int getSongCount() {
        return songCount;
    }
}

public class problem2 {
    public static void main(String[] args) {

        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        // Changing the copy
        copy[0] = "Hacked";

        System.out.println("Songs in playlist:");

        String[] actualSongs = p.getSongs();

        for (String song : actualSongs) {
            System.out.println(song);
        }

        System.out.println("Song count: " + p.getSongCount());
    }
}
