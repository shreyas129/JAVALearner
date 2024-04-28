package IntellijStarting.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album45 {

    private String name, artist;
    private SongList45 songs;

    public Album45(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList45();
    }

    public static void main(String[] args) {
        ArrayList<Album45> albums= new ArrayList<>();
        Album45 album = new Album45("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album45("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song45> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song45(title, duration));
    }
    
    public boolean addToPlayList(int trackNumber, LinkedList<Song45> playList) {

        Song45 song = songs.findSong(trackNumber);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song45> playList) {

        Song45 song = songs.findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public static class SongList45 {
        private ArrayList<Song45> songs;

        private SongList45() {
            songs = new ArrayList<>();
        }

        private boolean add(Song45 song){
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song45 findSong(String songTitle) {
            for (Song45 song : songs) {
                if (song.getTitle().equals(songTitle)) {
                    return song;
                }
            }
            return null;
        }

        private Song45 findSong(int trackNumber) {
            int i = trackNumber - 1;
            if (i>0&&i<songs.size()) {
                return songs.get(i);
            }
            return null;
        }
    }
}
