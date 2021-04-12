public class Media {
    private String title;
    private String category;
    private float cost;
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
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
    public float getCost() {
        return this.cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
}   
