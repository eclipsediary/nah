//package AimsProject.hust.soict.ictglobal.aims.disc;
//
//import AimsProject.hust.soict.ictglobal.aims.disc.DigitalVideoDisc;
//import AimsProject.hust.soict.ictglobal.aims.order.Order;
//
//import java.util.Scanner;
//
//public class DiskTest {
//    public static void main(String[] args) {
//        Order anOrder = new Order();
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
//        dvd1.setCategory("Animation");
//        dvd1.setCost(19.95f);
//        dvd1.setDirector("Roger Allers");
//        dvd1.setLength(87);
//
//        anOrder.addDigitalVideoDisc(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
//        dvd2.setCategory("Science Fiction");
//        dvd2.setCost(24.95f);
//        dvd2.setDirector("George Lucas");
//        dvd2.setLength(124);
//
//        anOrder.addDigitalVideoDisc(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
//        dvd3.setCategory("Animation");
//        dvd3.setCost(18.99f);
//        dvd3.setDirector("John Musker");
//        dvd3.setLength(90);
//
//        anOrder.addDigitalVideoDisc(dvd3);
//
//        System.out.println("Enter a title: ");
//        Scanner newDisc = new Scanner(System.in);
//        String title = newDisc.nextLine();
//
//        DigitalVideoDisc[] array = { dvd1, dvd2, dvd3};
//        if(DigitalVideoDisc.search(title,array)) {
//            System.out.println("Title found");
//        }
//        else System.out.println("Title not found");
//    }
//}
