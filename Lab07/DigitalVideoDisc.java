public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }
    public boolean search(String title) {
        for(String word : title.toLowerCase().split("\\s+")) {
            if(this.getTitle().toLowerCase().contains(word) == false) {
                return false;
            }
        }
        return true;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public static void main(String[] args) {
       
    }
}