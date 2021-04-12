import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();
    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(title, category, cost);
        this.authors = new ArrayList<String>(authors);
    }
    public boolean checkAuthorExist(String authorName) {
        for(int i = 0; i < this.authors.size(); i++) {
            if(this.authors.get(i).equals(authorName)) {
                return true;
            }
        }
        return false;
    }
    public void addAuthor(String authorName) {
        if(checkAuthorExist(authorName) == true) {
            System.out.println("Author is already exist");
            return;
        }
        this.authors.add(authorName);
    }
    public void removeAuthor(String authorName) {
        if(checkAuthorExist(authorName) == false) {
            System.out.println("Author is not already exist");
            return;
        }
        this.authors.remove(authorName);
    }
}
