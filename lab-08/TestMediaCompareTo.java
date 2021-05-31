import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMediaCompareTo {
    public static void main(String[] args) {
        DigitalVideoDisc d1 = new DigitalVideoDisc("quy1", "quy1", "quy1", 1, 21.0f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("quy2", "quy2", "quy2", 1, 20.0f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("quy3", "quy3", "quy3", 1, 22.0f);
        ArrayList<DigitalVideoDisc> discs = new ArrayList<DigitalVideoDisc>();
        discs.add(d1);
        discs.add(d2);
        discs.add(d3);
        // for(int i = 0; i < discs.size(); i++) {
        //     System.out.println(discs.get(i).getTitle());
        // }
        for(int i = 0; i < discs.size(); i++) {
            discs.get(i).play();
        }
        Iterator<DigitalVideoDisc> it = discs.iterator();
        System.out.println("-------------------------");
        System.out.println("The DVDs currently in the order are: ");
        while(it.hasNext()) {
            System.out.println(it.next().getTitle());
        }
        Collections.sort(discs);
        it = discs.iterator();
        System.out.println("-------------------------");
        System.out.println("The DVDs in sorted order are: ");
        while(it.hasNext()) {
            System.out.println(it.next().getTitle());
        }
        System.out.println("--------------------------");
    }
}