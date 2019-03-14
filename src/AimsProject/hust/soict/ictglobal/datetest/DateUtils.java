package AimsProject.hust.soict.ictglobal.datetest;

import java.util.Arrays;
public class DateUtils {
    public static int compareDate(MyDate date1, MyDate date2) {
        if (date1.accept().getYear() > date2.accept().getYear()) return 1;
        else if (date1.accept().getYear() == date2.accept().getYear()) {
            if (date1.accept().getMonth() > date2.accept().getMonth()) return 1;
            else if (date1.accept().getMonth() == date2.accept().getMonth()) {
                if (date1.accept().getDay() > date2.accept().getDay()) return 1;
                else return 0;
            }
            else return -1;
        }
        else return -1;
    }
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static MyDate[] sortDate(MyDate[] dateList, int size) {
        for( int i = 0; i < size; i++) {
            if(compareDate(dateList[i],dateList[i+1]) == 0) swap(dateList[i],dateList[i+1]);
        }
        return dateList;
    }
}
