import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();
    private String content;
    private List<String> contentTokens = new ArrayList<String>();
    private Map<String, Integer> wordFrequency = new HashMap();
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
    public void setContent(String content) {
        this.content = content;
        processContent();
    }
    public void processContent() {
        String temp = content.replace('.', ' ');
        String[] tokenArr = temp.split("\\s+"); 
        Arrays.sort(tokenArr);
        for(int i = 0; i < tokenArr.length; i++) {
            contentTokens.add(tokenArr[i]);
        }
        for(int i = 0; i < contentTokens.size(); i++) {
            if(!wordFrequency.containsKey(contentTokens.get(i))) {
                int num = 1;
                for(int j = i + 1; j < contentTokens.size(); j++) {
                    if(contentTokens.get(i).equals(contentTokens.get(j))) {
                        num++;
                    }
                }
                wordFrequency.put(contentTokens.get(i), num);
            }
        }
    }
    public String toString() {
        String str = "";
        str += "Title: " + this.getTitle() + "\n";
        str += "Category: " + this.getCategory()  + "\n";
        str += "Cost: " + this.getCost() + "\n";
        str += "Author: \n";
        for(int i = 0; i < authors.size(); i++) {
            str += authors.get(i) + "\n";
        }
        str += "Content length: " + contentTokens.size() + "\n";
        str += "Content tokens: " + "\n";
        for(int i = 0; i < contentTokens.size(); i++) {
            str += contentTokens.get(i) + "\n";
        }
        str += "Word frequency: " + "\n";
        for(Map.Entry<String, Integer> entry: wordFrequency.entrySet()) {
            str += "Key: " + entry.getKey() + " Value: " + entry.getValue() + "\n";  
        }
        return str;
    }
}

