package AimsProject.hust.soict.ictglobal.datetest;

import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {}

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(String date) {
        date = "day" + "month" + "year";
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setDay(String day) {
        int toDay = Integer.parseInt(day);
        this.day = toDay;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void setMonth(String month) {
        int toMonth = Integer.parseInt(month);
        this.month = toMonth;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setYear(String year) {
        int toYear = Integer.parseInt(year);
        this.year = toYear;
    }

    public void print() {
        MyDate newDate = new MyDate();
        newDate.getDay();
        newDate.getMonth();
        newDate.getYear();
        System.out.println(newDate);
    }
    public void print(MyDate date) {
        MyDate newDate = new MyDate();
        System.out.println("Date" + newDate.getDay() + newDate.getMonth() + newDate.getYear());
    }

    public static MyDate accept() {
        Scanner dateString = new Scanner(System.in);
        String date1 = dateString.nextLine();
        MyDate aDate = new MyDate();
        String[] oneDate = date1.split(" ");
        aDate.day = Integer.parseInt(oneDate[0]);
        aDate.month = Integer.parseInt(oneDate[1]);
        aDate.year = Integer.parseInt(oneDate[2]);
        return aDate;
    }
//    public void print() {
//        System.out.println("Day: " + day + "Month: " + month + "Year: " + year);
//    }
}
