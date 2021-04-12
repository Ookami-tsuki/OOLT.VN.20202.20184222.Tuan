public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title) {
        super();
        this.category = category;
        this.title = title;
    }
    public DigitalVideoDisc(String director, String category, String title) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
    }
    public DigitalVideoDisc(String title, String director, int length, float cost) {
        super();
        this.title = title;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
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
    public float getCost() {
        return this.cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public boolean search(String title) {
        for(String word : title.toLowerCase().split("\\s+")) {
            if(this.title.toLowerCase().contains(word) == false) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        DigitalVideoDisc test = new DigitalVideoDisc("hello world");
        System.out.println(test.search("heLLo      World"));
    }
}