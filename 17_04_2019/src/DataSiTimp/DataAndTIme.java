package DataSiTimp;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DataAndTIme {

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
        ex8();
    }

    public static void ex1() {
        Date now = new Date();
        System.out.println();
    }
    //or

    public static void ex2() {
        long millis = System.currentTimeMillis();
        Date now = new Date(millis);
        System.out.println(millis);
    }

    public static void ex3() {
        long millis = System.currentTimeMillis();
        Date now = new Date(millis);
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date);
        cal.setTime(now);
//        System.out.println(cal.get(Calendar.YEAR));
//        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
//        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        //or
        System.out.println(cal.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.ENGLISH));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
    }

    //ora la NewYork

    public static void ex4() {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("New York Time");

        System.out.print("Ora: " + calNewYork.get(Calendar.HOUR_OF_DAY));
        System.out.print(calNewYork.get(Calendar.MINUTE));
    }

    public static void ex5() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, Calendar.JULY);

        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.ENGLISH));
    }

    public static void ex6() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 44);
        Date date = cal.getTime();
        System.out.println(date);
    }

    public static void ex7() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -14);
        Date date = cal.getTime();
        System.out.println(date);
    }

    public static void ex8() {
        LocalDate today = LocalDate.now();
        LocalDate otherDay = LocalDate.of(2013, 2, 15);
        Period diff = Period.between(otherDay, today);

        System.out.println("Years: " + diff.getYears());
        System.out.println("Months " + diff.getMonths());
        System.out.println("Days " + diff.getDays());
    }
}


