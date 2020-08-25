import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String title;
    private String artist;
    private List<String> lyrics;

    public Song(String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }

    public static void parseLyrics(String lyricsString){
        String[] lyricsSplit = lyricsString.split(" ");
        List<String> lyricsList = new ArrayList<String>();
        lyricsList = Arrays.asList(lyricsSplit);
        for (String word : lyricsList) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        parseLyrics("this is a test");
    }
}



