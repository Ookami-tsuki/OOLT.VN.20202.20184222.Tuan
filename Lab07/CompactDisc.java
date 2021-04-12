import java.util.ArrayList; 

public class CompactDisc extends Media implements Playable{
    private String artist;
    private ArrayList<Track> tracks;
    public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    public String getArtist() {
        return this.artist;
    }
    public boolean checkTrackExist(Track track) {
        for(int i = 0; i < tracks.size(); i++) {
            if(tracks.get(i).getTitle().equals(track.getTitle())) {
                return true;
            }
        }
        return false;
    }
    public void addTrack(Track track) {
        if(checkTrackExist(track)) {
            System.out.println(track.getTitle() + "is already exist");
            return;
        }
        tracks.add(track);
        System.out.println(track.getTitle() + "was added");
    }
    public void removeTrack(Track track) {
        if(!checkTrackExist(track)) {
            System.out.println(track.getTitle() + "is not already exist");
            return;
        }
        tracks.remove(track);
        System.out.println(track.getTitle() + "was removed");
    }
    public int getLength() {
        int sum = 0;
        for(int i = 0; i < tracks.size(); i++) {
            sum += tracks.get(i).getLength();
        }
        return sum;
    }
    public void play() {
        for(int i = 0; i < tracks.size(); i++) {
            tracks.get(i).play();
        }
    }
}
