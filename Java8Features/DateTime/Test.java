package Java8Features.DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

// date and time 
/*
 * 1. LocalDate - date without timezone
 * 2. LocalTime - time without date or timezone
 * 3. LocalDateTime - date and time without timezone
 * 4. ZonedDateTime - date and time with timezone
 * 5. Instant - instantaneous point on timeline, used in machine timstamps
 * 6. Duration - duration of time between two points in time
 * 7. Period - period of time between two dates
 * 8. DateTimeFormatter - format and parses date and time
 * 
 */
public class Test {
    public static void main(String [] args){

        //date


        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate customDate = LocalDate.of(1999,04,05);
        System.out.println(customDate);

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();

        int year = now.getYear();

        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

        LocalDate yesterday = now.minusDays(1);
        if(now.isAfter(yesterday)){
            System.out.println("yes");
        }

        // time

        LocalTime aj = LocalTime.now();
        LocalTime customTime = LocalTime.of(14,30,14);
        LocalTime parsed = LocalTime.parse("15:30");
        //same like date we can work on minusHours etc

        // localdateTime
        //same like others method
        LocalDateTime mydate=LocalDateTime.parse("2025-11-22t14:55");
    
        //ZonedDateTime
        ZonedDateTime znow = ZonedDateTime.now();
        System.out.println(znow);
        Set<String> availableZoneIds= ZoneId.getAvailableZoneIds();
        // availableZoneIds.forEach(System.out::println);
        ZonedDateTime newYork=ZonedDateTime.of(2000,12,1,14,30,30,30, ZoneId.of("America/New_York"));
        System.out.println(newYork);

        ZonedDateTime newYorkTime= ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkTime);

        //instant
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Instant inow =Instant.now();
        System.out.println(inow);

        //duration
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration d1 = Duration.between(start,end);
        Duration d2= Duration.of(1,ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);
        //we can compare two durations too

        //lly period
        LocalDate lnow = LocalDate.now();
        LocalDate then = LocalDate.of(1999,04,05);
        Period p = Period.between(now, then);
        System.out.println(p);

        //dateTimeFormatter

        String d = "25/04/1998";
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate f= LocalDate.parse(d,myformat);
        System.out.println(f);
    
    }
}
