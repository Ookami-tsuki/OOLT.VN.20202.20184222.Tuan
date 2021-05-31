import java.util.ArrayList; 

public class CompactDisc extends Media implements Playable {
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
    public boolean checkTrackExist(Track track) throws Exception {
        if(track == null) {
            throw new NullPointerException("Null pointer err");
        }
        for(int i = 0; i < tracks.size(); i++) {
            if(tracks.get(i).getTitle().equals(track.getTitle())) {
                return true;
            }
        }
        return false;
    }
    public void addTrack(Track track) throws Exception {
        if(track == null) {
            throw new NullPointerException("Null pointer err");
        }
        if(checkTrackExist(track)) {
            System.out.println(track.getTitle() + "is already exist");
            return;
        }
        tracks.add(track);
        System.out.println(track.getTitle() + "was added");
    }
    public void removeTrack(Track track) throws Exception {
        if(track == null) {
            throw new NullPointerException("Null pointer err");
        }
        if(!checkTrackExist(track)) {
            System.out.println(track.getTitle() + "is not already exist");
            throw new Exception(track.getTitle() + "is not already exist");
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
    public void play() throws PlayerException {
        if(this.getLength() == 0) {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
        for(int i = 0; i < tracks.size(); i++) {
            try {
                tracks.get(i).play();
            }
            catch(PlayerException err) {
                System.out.println(err.getMessage());
            }
        }
    }
    public String playCD() {
        String playStr = "";
        for(int i = 0; i < tracks.size(); i++) {
            playStr = playStr + tracks.get(i).playTrack() + "\n";
        }
        return playStr;
    }
    public int getTracksSize() {
        return tracks.size();
    }
    @Override
    public int compareTo(Object o) throws NullPointerException, ClassCastException {
        if(o == null) {
            throw new NullPointerException("Null pointer error");
        }
        if(o instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) o;
            if(tracks.size() > cd.getTracksSize()) {
                return 1;
            }
            else if(tracks.size() == cd.getTracksSize()) {
                if(this.getLength() > cd.getLength()) {
                    return 1;
                }
                else if (this.getLength() == cd.getLength()) {
                    return 0;
                }
                return -1;
            }
            return -1;
        }
        throw new ClassCastException("Class cast error");
    }
}