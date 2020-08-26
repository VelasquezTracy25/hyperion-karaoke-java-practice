import java.util.Arrays;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    //    public void setSongs(List<String> songs) {
//        songs = songs;
//    }

    public void printTrackListings() {
        System.out.println(name.toUpperCase() + " track listing...");
        for (int i = 0; i < songs.size(); i += 1) {
            System.out.println(String.format("%d. %s by %s", (i + 1), songs.get(i).getTitle(), songs.get(i).getArtist()));
        }

    }


    public static void main(String[] args) {

        Album a = new Album("90s Hits", Arrays.asList(
                new Song("Every Day is a Winding Road", "Sheryl Crow", Song.parseLyrics("Everyday is a winding road ... I get a little bit closer to feeling fine")),
                new Song("Ready to Go", "Republica", Song.parseLyrics("I'm standing on the rooftops shouting out, Baby, I'm ready to go")),
                new Song("Airbag", "Radiohead", Song.parseLyrics("In an interstellar burst I am back to save the universe"))
        ));

        a.printTrackListings();
    }
}
