package AimsProject.hust.soict.ictglobal.aims.order;

import AimsProject.hust.soict.ictglobal.aims.disc.Media;
import java.util.ArrayList;
import java.sql.Time;
import java.util.Iterator;
import java.util.List;

public class Order {
    private static int totalCost;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public Order (ArrayList<Media> disc){
        this.itemsOrdered = disc;
    }
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }
     public void addMedia(Media aDisc) {
        itemsOrdered.add(aDisc);
     }

    public void removeMedia (int id) {
        Iterator<Media> itr = itemsOrdered.iterator();
        while (itr.hasNext()) {
            Media aDiscInsideList = itr.next();
            if(id == aDiscInsideList.getId()) {
                System.out.println("Disc existed.");
                itr.remove();
                System.out.println("Disc is removed.");
            } else {
                System.out.println("Disc is not existed.");
            }
        }
    }
    public float totalCost() {
        int i;
        float total = 0;
        for(i=0; i < itemsOrdered.size(); i++) {
            total = total + itemsOrdered.get(i).getCost();
        }
        return total;
    }

}
