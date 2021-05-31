public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }
    public boolean search(String title) throws Exception {
        if(title == null) {
            throw new NullPointerException("Null pointer error");
        }
        for(String word : title.toLowerCase().split("\\s+")) {
            if(this.getTitle().toLowerCase().contains(word) == false) {
                return false;
            }
        }
        return true;
    }
    public void play() throws PlayerException {
        if(this.getLength() == 0) {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    // public int compareTo(Object o) {
    //    float c = super.getCost();
    //    DigitalVideoDisc d = (DigitalVideoDisc) o;
    //    if(c > d.getCost()) {
    //        return 1;
    //    } 
    //    else if (c == d.getCost()) {
    //        return 0;
    //    }
    //    return -1;
    // }
    public static void main(String[] args) {
        
    }
}