package Codewars;

public class SeeYouNextHappyYear {
    public static void main(String[] args) {
        System.out.println(nextHappyYear(7999));
    }
    static public int nextHappyYear(int year) {
        int a,b,c,d;
        do {year = year +1;
            a = year / 1000;
            b = (year-a*1000) / 100;
            c = (year-a*1000-b*100) / 10;
            d = year % 10;}
        while (!(a!=b && b!=c && c!=d && a!=c && a!=d && b!=d));
        return year;
    }
}
