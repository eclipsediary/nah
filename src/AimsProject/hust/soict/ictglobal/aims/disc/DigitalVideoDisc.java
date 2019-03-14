package AimsProject.hust.soict.ictglobal.aims.disc;

public class DigitalVideoDisc extends Media {
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float  cost;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

//    public DigitalVideoDisc(String title){
//        super();
//        this.title = title;
//    }
//
//    public DigitalVideoDisc(float cost) {
//        this.cost = cost;
//    }
//
//    public DigitalVideoDisc(int length) {
//        this.length = length;
//    }
//
//    public DigitalVideoDisc(String title, String category) {
//        super();
//        this.title = title;
//        this.category = category;
//    }
//
//    public DigitalVideoDisc(String title, String category, String director) {
//        super();
//        this.title = title;
//        this.category = category;
//        this.director = director;
//    }
//    public DigitalVideoDisc(String title, String category, String director, int length){
//        super();
//        this.title = title;
//        this.category = category;
//        this.director = director;
//        this.length = length;
//    }
    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id,title,category,cost);
        this.director = director;
        this.length = length;
    }
    static boolean search (String title, DigitalVideoDisc[] disc) {
        String[] word = title.split(" ");
        if (word.length <= 0) return false;
        for(DigitalVideoDisc aDisc: disc) {
            for(String aWord : word ){
                if(aDisc.title.toLowerCase().contains(aWord.toLowerCase()));
                return true;
            }
        }
        return false;
    }

}
