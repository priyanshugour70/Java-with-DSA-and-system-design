// import java.util.*;
// import java.sql.*;

public class _01_Date_and_Time {

    // Date and Time API in java
    // Date and Time API: (Joda-Time API)
    // ● Until Java 1.7 version the classes present in Java.util package to handle
    // Date and Time (like Date, Calendar,TimeZone etc) are not up to the mark with
    // respect to convenience and performance.
    // ● To overcome this problem in the 1.8 version oracle people introduced
    // Joda-Time API.
    // ● This API developed by joda.org and available in Java in the form of
    // "java.time" package.
    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();

        System.out.println(date);

        long timeInMileSec = date.getTime();

        java.sql.Date date1 = new java.sql.Date(timeInMileSec);

        System.out.println(date1);
    }
}