public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public String getDirector() {
        return this.director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public boolean search(String title) {
        for(String word : title.toLowerCase().split("\\s+")) {
            if(this.getTitle().toLowerCase().contains(word) == false) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       
    }
}
