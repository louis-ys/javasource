package api.utill;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());

        System.out.println(date.getDayOfMonth());
        System.out.println("" + date.plusYears(1));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }

}
