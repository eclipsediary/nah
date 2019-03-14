package AimsProject.hust.soict.ictglobal.aims;

import AimsProject.hust.soict.ictglobal.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.ictglobal.aims.disc.Media;
import AimsProject.hust.soict.ictglobal.aims.order.Order;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Aims {

    public static void showMenu() {

        Scanner menu = new Scanner(System.in);
        int choice;
        Scanner disc = new Scanner(System.in);
        ArrayList<Media> anOrder = new ArrayList<Media>();
        Order newOrder = new Order(anOrder);
        do {
            System.out.println("Order Management Application: ");
            System.out.println("--------------------------------");
            System.out.println("1. Create new order");
            System.out.println("2. Add item to the order");
            System.out.println("3. Delete item by id");
            System.out.println("4. Display the items list of order");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");

            choice = menu.nextInt();
            switch (choice) {
                case 0: break;
                case 1:
                    System.out.println("An order is created");
                    break;
                case 2:
                    System.out.println("Enter an id");
                    int id = disc.nextInt();
                    System.out.println("Enter a title");
                    String title = disc.nextLine();
                    System.out.println("Enter a category");
                    String category = disc.nextLine();
                    System.out.println("Enter price");
                    float cost = disc.nextFloat();
                    Media aDisc = new Media(id, title,category,cost);

                    anOrder.add(aDisc);

                    newOrder.addMedia(aDisc);
                    System.out.println(Arrays.deepToString(anOrder.toArray()));
                    System.out.println("A disc has been added");
                    break;
                case 3:
                    System.out.println("Enter an id");
                    int aID = disc.nextInt();
                    anOrder.remove(aID);
                    break;
                case 4:
                    Iterator<Media> it = anOrder.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    break;
                default: break;
            }
        } while (choice != 4);
    }
    public static void main (String[] args) {
        showMenu();
    }

}
