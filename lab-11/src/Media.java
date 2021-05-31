public abstract class Media implements Comparable {
    private String title;
    private String category;
    private float cost;
    private static int numId = 1;
    private int id;
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = numId++;
    }
    public String getTitle() {
        return this.title;
    }
    public String getCategory() {
        return this.category;
    }
    public float getCost() {
        return this.cost;
    }
    public int getId() {
        return this.id;
    }
    public boolean equals(Object o) throws NullPointerException, ClassCastException {
        if(o == null) {
            throw new NullPointerException("null pointer err");
        }
        if(o instanceof Media) {
            Media m = (Media) o;
            return id == m.getId() ? true : false;  
        }
        throw new ClassCastException("class cast err");
    }
    public int compareTo(Object o) throws NullPointerException, ClassCastException {
        if(o == null) {
            throw new NullPointerException("Null pointer error");
        }
        if(o instanceof Media) {
            Media m = (Media) o;
            return title.compareTo(m.getTitle()); 
        }
        throw new ClassCastException("Class cast error");
    }
}   