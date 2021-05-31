public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private MyDate dateOrdered;
    private static int nbOrders = 0;
    public static final int MAX_LIMITTED_ORDERS = 5;

    public Order() {
        super();
        if(nbOrders >= MAX_LIMITTED_ORDERS) {
            return;
        }
        nbOrders++;
        this.dateOrdered = new MyDate(); 
    }
    public void printOrder(DigitalVideoDisc freeItem) {
        System.out.print("Date: ");
        this.dateOrdered.printDate();
        System.out.println("Ordered Items:");
        float sum = 0.00f;
        for(int i = 0; itemsOrdered[i] != null; i++) {
            if(itemsOrdered[i].getTitle().equals(freeItem.getTitle())) {
                System.out.println(itemsOrdered[i].getTitle() + " is free");
                continue;
            }
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + 
            " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
            sum += itemsOrdered[i].getCost();
        }
        System.out.println("Total cost: " + sum);
    }
    public int getQtyOrdered() {
        return this.qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(this.qtyOrdered == MAX_NUMBERS_ORDERED) {
            return;
        }
        this.itemsOrdered[this.qtyOrdered++] = disc;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc ...discs) {
        if(discs != null) {
            for(int i = 0; i < discs.length; i++) {
                if(this.qtyOrdered >= MAX_NUMBERS_ORDERED) {
                    System.out.println("The item quantity has reached its limit");
                    continue;
                }
                addDigitalVideoDisc(discs[i]);
                setQtyOrdered(this.qtyOrdered++);
            } 
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(this.qtyOrdered + 1 <= MAX_NUMBERS_ORDERED) {
            addDigitalVideoDisc(dvd1);
            setQtyOrdered(this.qtyOrdered++);
        } 
        else {
            System.out.println("The dvd " + dvd1.getTitle() + " could not be added");
        }
        if(this.qtyOrdered + 1 <= MAX_NUMBERS_ORDERED) {
            addDigitalVideoDisc(dvd2);
            setQtyOrdered(this.qtyOrdered++);
        } 
        else {
            System.out.println("The dvd " + dvd2.getTitle() + " could not be added");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(this.qtyOrdered == 0) {
            return;
        }
        this.qtyOrdered--;
    }
    public float totalCost(DigitalVideoDisc freeItem) {
        float total = 0.0f;
        for(int i = 0; i < this.qtyOrdered; i++) {
            if(freeItem.getTitle().equals(this.itemsOrdered[i].getTitle())) {
                System.out.println(freeItem.getTitle() + " is free");
                continue;
            }
            total += this.itemsOrdered[i].getCost();
        }
        return total;
    }
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(dvd1 != null && dvd2 != null) {
            if(dvd1.getTitle() != null && dvd2.getTitle() != null) {
                String temp = dvd1.getTitle();
                dvd1.setTitle(dvd2.getTitle());
                dvd2.setTitle(temp);
            }
            if(dvd1.getDirector() != null && dvd2.getDirector() != null) {
                String temp = dvd1.getDirector();
                dvd1.setDirector(dvd2.getDirector());
                dvd2.setDirector(temp);
            }
            if(dvd1.getCategory() != null && dvd2.getDirector() != null) {
                String temp = dvd1.getTitle();
                dvd1.setCategory(dvd2.getCategory());
                dvd2.setCategory(temp);
            }
            if(dvd1.getLength() != 0 && dvd2.getLength() != 0) {
                int temp = dvd1.getLength();
                dvd1.setLength(dvd2.getLength());
                dvd2.setLength(temp);
            }
            if(dvd1.getCost() != 0.00f && dvd2.getCost() != 0.00f) {
                float temp = dvd1.getCost();
                dvd1.setCost(dvd2.getCost());
                dvd2.setCost(temp);
            }
        }
    }
    public DigitalVideoDisc getALuckyItem() {
        if(this.qtyOrdered != 0) {
            return this.itemsOrdered[(int)Math.floor(Math.random() * this.qtyOrdered)];
        }
        return null;
    }
    public static void main(String[] args) {
        Order anOder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD1");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger");
        dvd1.setLength(87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD2");
        dvd2.setCategory("Animation");
        dvd2.setCost(20.15f);
        dvd2.setDirector("Roger");
        dvd2.setLength(87);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD3");
        dvd3.setCategory("Animation");
        dvd3.setCost(30.0f);
        dvd3.setDirector("Roger");
        dvd3.setLength(87);
        anOder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
        DigitalVideoDisc freeItem = anOder.getALuckyItem();
        anOder.totalCost(freeItem);
        anOder.printOrder(freeItem);
    }
}