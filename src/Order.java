import java.sql.Time;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    public static int nbOrders = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private Time dateOrder;

    public Time getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Time dateOrder) {
        this.dateOrder = dateOrder;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    //add more an item to the list
    public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full");
            return false;
        }
        itemsOrdered[qtyOrdered] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), disc.getDirector(), disc.getLength(), disc.getCost());
        qtyOrdered++;
        System.out.println("The disc has been added");
        return true;
    }
    public boolean addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The order is full");
            return false;
        }
        for(int i = 0; i<qtyOrdered; i++) {
            itemsOrdered[qtyOrdered] = new DigitalVideoDisc(dvdList[i].getTitle(), dvdList[i].getCategory(), dvdList[i].getDirector(), dvdList[i].getLength(), dvdList[i].getCost());
        }
        qtyOrdered++;
        System.out.println("The disc has been added");
        System.out.println("The number of items currently in the order is: " + qtyOrdered);
        return true;
    }
    public boolean addDigitalVideoDisc(DigitalVideoDisc[] dvdList, int numberOfItems) {
        if(numberOfItems == MAX_NUMBERS_ORDERED) {
            System.out.println("Order Full");
            return false;
        }
        for(int i = 0; i<numberOfItems; i++) {
            itemsOrdered[qtyOrdered] = new DigitalVideoDisc(dvdList[i].getTitle(), dvdList[i].getCategory(), dvdList[i].getDirector(), dvdList[i].getLength(), dvdList[i].getCost());
        }
        qtyOrdered = numberOfItems;
        System.out.println("The disc has been added");
        return true;
    }
    public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The order is full");

            return false;
        }
        itemsOrdered[qtyOrdered] = new DigitalVideoDisc(dvd1.getTitle(), dvd1.getCategory(), dvd1.getDirector(), dvd1.getLength(), dvd1.getCost());
        itemsOrdered[qtyOrdered] = new DigitalVideoDisc(dvd2.getTitle(), dvd2.getCategory(), dvd2.getDirector(), dvd2.getLength(), dvd2.getCost());
        qtyOrdered += 2;
        System.out.println("The disc have been added");
        System.out.println("The number of items currently in the order is: " + qtyOrdered);
        return true;
    }
    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == 0) {
            System.out.println("The order is empty");
            return false;
        }
        int i,j;
        for(i=0; i<qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                for(j=i; j<qtyOrdered-1; j++) {
                    itemsOrdered[j] = new DigitalVideoDisc(itemsOrdered[j+1].getTitle(), itemsOrdered[j+1].getCategory(), itemsOrdered[j+1].getDirector(), itemsOrdered[j+1].getLength(), itemsOrdered[j+1].getCost());
                }
                qtyOrdered--;
                System.out.println("The disc has been removed");
                return true;
            }
        }
        System.out.println("Cannot find the disc in the order");
        return false;
    }

    public float totalCost() {
        int i;
        float total = 0;
        for(i=0; i<qtyOrdered; i++) {
            total = total + itemsOrdered[i].getCost();
        }
        return total;
    }
}
