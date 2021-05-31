public class Track implements Playable {
    private String title;
    private int length;
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return this.title;
    }
    public int getLength() {
        return this.length;
    }
    public void play() throws PlayerException {
        if(this.getLength() == 0) {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public String playTrack() {
        return "Playing Track: " + this.getTitle() + ", " + "Track length: " + this.getLength();
    }
    public boolean equals(Object o) {
        if(o instanceof Track) {
            Track t = (Track) o;
            return title.equals(t.getTitle()) && length == t.getLength() ? true : false; 
        }
        return false;
    }
}