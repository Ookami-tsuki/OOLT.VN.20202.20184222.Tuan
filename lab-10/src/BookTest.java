import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<String> authors = new ArrayList<String>();
        authors.add("minh quy");
        Book b = new Book("quy", "quy", 25.5f, authors);
        try {
            b.setContent("quy. abc abc.abc def");
        }
        catch(Exception err) {
            System.out.println(err.getMessage());
        }
        System.out.println(b.toString());
    }
}
