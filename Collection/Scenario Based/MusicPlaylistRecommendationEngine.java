import java.util.LinkedList;

public class MusicPlaylistRecommendationEngine {
    static LinkedList<String> playlist=new LinkedList<>();

    static void playSong(String song){
        playlist.remove(song);
        playlist.addFirst(song);
        if(playlist.size()>10){
            playlist.removeLast();
        }
    }

    static void searchSong(String song){
        if(playlist.contains(song)){
            System.out.println(song+" found in recently played.");
        }else{
            System.out.println(song+" not found.");
        }
    }

    static void display(){
        System.out.println("Recently Played Songs:");
        for(String song:playlist){
            System.out.println(song);
        }
    }

    public static void main(String[] args){
        playSong("Shape of You");
        playSong("Believer");
        playSong("Perfect");
        playSong("Faded");
        playSong("Closer");
        playSong("Attention");
        playSong("Senorita");
        playSong("Levitating");
        playSong("Bones");
        playSong("Thunder");
        playSong("Unstoppable");
        searchSong("Faded");
        display();
    }
}
