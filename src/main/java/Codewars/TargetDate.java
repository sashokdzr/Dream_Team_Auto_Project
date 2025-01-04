package Codewars;

import java.time.LocalDate;



public class TargetDate {
    public static void main(String[] args) {
        System.out.println(dateNbDays(100, 150, 2));
    }
    // 10%   -  10/36000 - 100*10/3600
    public static String dateNbDays(double a0, double a, double p) {
        // your code
        //2016-01-01
        LocalDate date1 = LocalDate.of(2016, 1, 1);
        double ratePerDay = p/36000;
        int dayCount;
//        a = a0 + ratePerDay * a0 * dayCount;
//        a = a0 (1 + ratePerDay * dayCount);
        dayCount = (int) (((a / a0) - 1) / ratePerDay);
        //dayCount = (int) Math.floor((a - a0) / ratePerDay);
        int year = dayCount/360;
        LocalDate result = date1.plusYears(year).plusDays(dayCount - year * 360);
        return result.toString();
    }
}
