package AimsProject.hust.soict.ictglobal.aims.disc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book extends Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title,category,cost);
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String author) {
        authors.add(author);
    }
//    public static void addAuthor (String authorName) {
//        for (int i = 0; i < Book.getAuthors().size(); i++) {
//            if(authorName.equals(Book.getAuthors().get(i))) {
//                System.out.println("Author existed.");
//            } else {
//                Book.getAuthors().add(authorName);
//                System.out.println("Author's name is added.");
//            }
//        }
//    }
    public void removeAuthor (String authorName) {
        Iterator<String> itr = authors.iterator();
        while (itr.hasNext()) {
            String aName = itr.next();
            if(authorName.equals(aName)) {
                System.out.println("Author existed.");
                itr.remove();
                System.out.println("Author's name is removed.");
            } else {
                System.out.println("Author's name is not existed.");
            }
        }
    }
}
