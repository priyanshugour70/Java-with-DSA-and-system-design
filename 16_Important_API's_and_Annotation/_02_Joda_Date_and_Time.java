// Joda-Time is a popular open-source date and time library for Java programming language. It provides an extensive set of APIs for date and time manipulation and calculation.

// Java also includes its own built-in date and time package, which is known as the java.time package. This package was introduced in Java 8 as part of the Java SE 8 release and provides similar functionality to Joda-Time.
import java.time.*;

public class _02_Joda_Date_and_Time {
    public static void main(String[] args) {

        // For Normal Date...
        // import java.time.*;
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "/" + month + "/" + year);
        System.out.println("***************************************");

        // For Normal Time...
        // import java.time.*;
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nanSec = time.getNano();

        System.out.println(hour + ":" + minute + ":" + second + ":" + nanSec);
        System.out.println("***************************************");
    }
}