import java.util.ArrayList;

public class Arraylistplaylist {
    public static void main(String args[]){
        ArrayList<String> playlist = new ArrayList<String>();
        playlist.add("song1");
        playlist.add("song2");
        playlist.contains("song3");
        playlist.add("song4");
        System.out.println(playlist.size());
        playlist.remove("song2");
        for(String song:playlist){
            System.out.println(song);
        }
    }
}
